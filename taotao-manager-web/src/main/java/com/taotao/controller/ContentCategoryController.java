package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EazyUITreeNode;
import com.taotao.content.service.ContentCategoryService;

@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {
@Autowired
private ContentCategoryService service;

@RequestMapping("/list")
@ResponseBody
public List<EazyUITreeNode> getContentCategoryList(@RequestParam(value="id",defaultValue="0") long parentId){
	
	return service.getContentCategoryList(parentId);
}
}
