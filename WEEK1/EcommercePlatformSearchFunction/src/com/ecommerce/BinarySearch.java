package com.ecommerce;


public class BinarySearch {

    public static Product search(Product[] products, int targetProductId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (products[mid].getProductId() == targetProductId) {
                return products[mid];
            }
            
            if (targetProductId < products[mid].getProductId()) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null; 
    }
}