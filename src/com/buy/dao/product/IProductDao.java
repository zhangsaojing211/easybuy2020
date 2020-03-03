package com.buy.dao.product;

import com.buy.entity.Product;
import com.buy.utils.ProductParams;

import java.util.List;

/**
 * 商品信息接口
 */
public interface IProductDao {

    /**
     * 根据条件查询商品列表
     * @param params
     * @return
     */
    List<Product> queryProdutcList(ProductParams params);

    /**
     * 根据条件查询商品的数量
     * @param params
     * @return
     */
    int queryProdutcCount(ProductParams params);
}
