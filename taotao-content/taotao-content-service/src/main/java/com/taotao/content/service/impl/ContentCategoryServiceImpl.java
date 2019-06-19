package com.taotao.content.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EazyUITreeNode;
import com.taotao.content.service.ContentCategoryService;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import com.taotao.pojo.TbContentCategoryExample.Criteria;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {
@Autowired
private TbContentCategoryMapper mapper;
	@Override
	public List<EazyUITreeNode> getContentCategoryList(Long parentId) {
		
		TbContentCategoryExample example = new TbContentCategoryExample();
		Criteria criteria = example.createCriteria();
		
		 criteria.andParentIdEqualTo(parentId);
		 
		 List<TbContentCategory>list = mapper.selectByExample(example);
		 
		 List<EazyUITreeNode> result=new ArrayList<>();
		 for (TbContentCategory tbContentCategory : list) {
			EazyUITreeNode node = new EazyUITreeNode();
			
			node.setId(tbContentCategory.getId());
			
			node.setState(tbContentCategory.getIsParent()?"closed":"open");
			
			node.setText(tbContentCategory.getName());
			
			result.add(node);
		}
		return result;
	}

}
