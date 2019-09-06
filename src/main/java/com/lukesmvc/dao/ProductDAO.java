package com.lukesmvc.dao;

import com.lukesmvc.model.Product;

import java.util.List;

/**
 * Created by lyaegel on 09/01/2019
 */
public interface ProductDAO {
    List<Product> getProducts();
    void addProduct(Product product);
    int getCount(String name1, String name2);
    List innerJoinExample();
}
