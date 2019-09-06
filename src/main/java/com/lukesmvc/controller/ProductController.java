package com.lukesmvc.controller;

import com.lukesmvc.dto.ProductDTO;
import com.lukesmvc.model.Product;
import com.lukesmvc.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lyaegel on 09/01/2019
 */
@CrossOrigin
@RestController
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    //@CrossOrigin(origins = "http://localhost:63342")
    @GetMapping("/products")
    public List<ProductDTO> getProducts(){
       List<Product> products = productService.getProducts();

       List<ProductDTO> productDTOs = products.stream()
               .map(p -> new ProductDTO(String.valueOf(p.getId()), p.getName(), p.getDescription(),p.getCategory(), new BigDecimal(p.getPrice())))
               .collect(Collectors.toList());

       return productDTOs;
    }

    @GetMapping("/products/update/{name1}/{name2}")
    public int updateGetCount(@PathVariable String name1, @PathVariable String name2){
        return productService.getCount(name1, name2);
    }

    @GetMapping("/products/count")
    public List innerJoinExample(){
        return productService.innerJoinExample();
    }

}
