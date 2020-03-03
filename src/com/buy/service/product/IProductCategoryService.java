package com.buy.service.product;

import com.buy.entity.ProductCategory;
import com.buy.utils.ProductCategoryVo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface IProductCategoryService {
    List<ProductCategory> queryAllProductCategory(String parentId);

    List<ProductCategoryVo> queryAllProductCategory();
}
