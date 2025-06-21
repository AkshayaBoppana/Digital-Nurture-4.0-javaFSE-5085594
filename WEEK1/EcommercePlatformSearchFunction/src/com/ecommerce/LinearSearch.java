package com.ecommerce;


public class LinearSearch {

    public static Product search(Product[] products, int targetProductId) {
      
        for (Product product : products) {
            
            if (product.getProductId() == targetProductId) {
                return product; 
            }
        }      
        return null;
    }
}