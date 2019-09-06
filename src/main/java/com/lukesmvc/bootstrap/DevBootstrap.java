package com.lukesmvc.bootstrap;

import com.lukesmvc.model.Product;
import com.lukesmvc.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lyaegel on 09/01/2019
 */
@RestController
public class DevBootstrap {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/bootstrap")
    public String bootstrap(){

        Product product1 = new Product("Kayak", "A boat for one person", "Watersports", "275");
        Product product2 = new Product("Lifejacket", "Protective and fashionable", "Watersports", "48.95");
        Product product3 = new Product("Soccer Ball", "FIFA-approved size and weight", "Soccer", "19.5");
        Product product4 = new Product("Corner Flags", "Give your playing field a professional touch", "Soccer", "34.95");
        Product product5 = new Product("Stadium", "Flat-packed 35,000-seat stadium", "Soccer", "79500.00");
        Product product6 = new Product("Thinking Cap", "Improve your brain effeciency by 75%", "Chess", "16");
        Product product7 = new Product("Unsteady Chair", "Secretly give your opponent a disadvantage", "Chess", "29.95");
        Product product8 = new Product("Human Chess Board", "A fun game for the family", "Chess", "75");
        Product product9 = new Product("Bling-Bling King", "Gold-plated, diamond-studded King", "Chess", "1200");
        Product product10 = new Product("Kayak", "A boat for one person", "Watersports", "275");

        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);
        productService.addProduct(product4);
        productService.addProduct(product5);
        productService.addProduct(product6);
        productService.addProduct(product7);
        productService.addProduct(product8);
        productService.addProduct(product9);
        productService.addProduct(product10);


        return "Bootstrap was a success!";
    }
}
