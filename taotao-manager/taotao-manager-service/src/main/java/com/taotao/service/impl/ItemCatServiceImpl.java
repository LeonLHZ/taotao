package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EazyUITreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemCatExample.Criteria;
import com.taotao.service.ItemCatService;
@Service
public class ItemCatServiceImpl implements ItemCatService {
@Autowired
private TbItemCatMapper mapper;
	@Override
	public List<EazyUITreeNode> getItemCatList(long parentId) {
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = mapper.selectByExample(example);
		List<EazyUITreeNode>reasult = new ArrayList<>();
		for (TbItemCat tbItemCat : list) {
			EazyUITreeNode eazyUITreeNode = new EazyUITreeNode();
			eazyUITreeNode.setId(tbItemCat.getId());
			eazyUITreeNode.setText(tbItemCat.getName());
			eazyUITreeNode.setState(tbItemCat.getIsParent()?"closed":"open");
			reasult.add(eazyUITreeNode);
		}
		return reasult;
	}

}
