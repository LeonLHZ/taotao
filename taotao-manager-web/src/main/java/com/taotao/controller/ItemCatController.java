package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EazyUITreeNode;
import com.taotao.service.ItemCatService;

@Controller
public class ItemCatController {
@Autowired
private ItemCatService service;

@RequestMapping("/item/cat/list")
@ResponseBody
public List<EazyUITreeNode> getItemCatList(@RequestParam(name="id",defaultValue="0")long parentId){
	return service.getItemCatList(parentId);
}
}
