package com.buy.service.product;

import com.buy.dao.product.IProductDao;
import com.buy.dao.product.ProductImpl;
import com.buy.entity.Product;
import com.buy.utils.ProductParams;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private IProductDao dao=new ProductImpl();
    @Override
    public List<Product> queryProdutcList(ProductParams params) {
        return dao.queryProdutcList(params);
    }

    @Override
    public int queryProdutcCount(ProductParams params) {
        return dao.queryProdutcCount(params);
    }
}
