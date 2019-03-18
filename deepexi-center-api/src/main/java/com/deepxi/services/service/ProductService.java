package com.deepxi.services.service;

import com.deepexi.util.pageHelper.PageBean;
import com.deepxi.services.domain.eo.Product;

public interface ProductService {

    PageBean getProductList(Integer page, Integer size, Integer price);

    Product getProductById(String id);

    Integer createProduct(Product product);

    Boolean deleteProductById(String id);

    void testError();
}
