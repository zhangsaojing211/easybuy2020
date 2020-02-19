package com.buy.test;

import com.buy.dao.product.IProductCategory;
import com.buy.dao.product.ProductCategoryImpl;
import com.buy.entity.ProductCategory;
import org.junit.Test;


import java.util.List;

public class TestProdctCategory {
      @Test
            public void testProductCategory(){
            IProductCategory iProductCategory=new ProductCategoryImpl();
            List<ProductCategory> productCategories=iProductCategory.queryAllProductCategory("0");
            for (ProductCategory category:productCategories) {
                  System.out.println(category.getName());
            }
        }
}
