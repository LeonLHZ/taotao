package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EazyUITreeNode;

public interface ItemCatService {

List<EazyUITreeNode> getItemCatList(long parentId);
}
