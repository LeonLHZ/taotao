package com.taotao.content.service;

import java.util.List;

import com.taotao.common.pojo.EazyUITreeNode;

public interface ContentCategoryService {
List<EazyUITreeNode> getContentCategoryList(Long parentId);
}
