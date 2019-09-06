package com.lukesmvc.services;

import com.lukesmvc.dao.ProductDAO;
import com.lukesmvc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lyaegel on 09/01/2019
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Product> getProducts(){
        return productDAO.getProducts();
    }

    @Override
    public void addProduct(Product product){
        productDAO.addProduct(product);
    }

    @Override
    public int getCount(String name1, String name2) {
        return productDAO.getCount(name1, name2);
    }

    @Override
    public List innerJoinExample() {
        return productDAO.innerJoinExample();
    }
}
