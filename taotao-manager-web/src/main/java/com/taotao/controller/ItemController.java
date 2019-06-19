package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
@Autowired
private ItemService is;

@RequestMapping("/{itemId}")
@ResponseBody
public TbItem getItemById(@PathVariable Long itemId) {
   
   return is.getItemById(itemId);
}


@RequestMapping("/list")
@ResponseBody
public EasyUIDataGridResult getItemList(Integer page,Integer rows) {
   EasyUIDataGridResult result = is.getItemList(page, rows);
   return result;
}

@RequestMapping(value="/save",method=RequestMethod.POST)
@ResponseBody
public TaotaoResult addItem(TbItem item,String desc) {
	return is.addItem(item, desc);
}

}
