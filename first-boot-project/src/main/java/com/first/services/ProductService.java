package com.first.services;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public  void createProduct() {
        System.out.println("Creating product");
        System.out.println("product created");



    }
    //get
    public void gettingProduct() {
        System.out.println("getting product");
        System.out.println("Got");
    }

    //search
    public  void searchProduct() {
        System.out.println("searching product");
        System.out.println("Got");
    }

}
