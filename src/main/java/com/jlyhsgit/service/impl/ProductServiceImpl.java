package com.jlyhsgit.service.impl;

import com.jlyhsgit.dao.ProductDao;
import com.jlyhsgit.model.Product;
import com.jlyhsgit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
