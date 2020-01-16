package com.example.demo.controllers;

import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 11/6/15.
 */
@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String listProducts(Model model){

        model.addAttribute("products", productService.listAllProducts());

        return "products";
    }
//create a method
    public void addRRuga(){
        System.out.println("Rruga u shtu");//
    }
}
