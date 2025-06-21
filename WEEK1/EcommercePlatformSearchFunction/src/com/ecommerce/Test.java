package com.ecommerce;
import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        
        Product[] products = {
            new Product(102, "Smartphone", "Electronics"),
            new Product(201, "T-Shirt", "Apparel"),
            new Product(101, "Laptop", "Electronics"),
            new Product(301, "Book", "Books"),
            new Product(202, "Jeans", "Apparel")
        };

        System.out.println("--- Testing Linear Search ---");
        int targetIdLinear = 101;
        Product foundProductLinear = LinearSearch.search(products, targetIdLinear);
        System.out.println("Searching for Product ID: " + targetIdLinear);
        if (foundProductLinear != null) {
            System.out.println("Found: " + foundProductLinear);
        } else {
            System.out.println("Product not found.");
        }
        System.out.println("\n");

        System.out.println("--- Testing Binary Search ---");
        System.out.println("First, sorting the array by Product ID for Binary Search...");
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
        
        System.out.println("Sorted Products:");
        for(Product p : products) {
            System.out.println("  " + p);
        }
        System.out.println();

        int targetIdBinary = 101;
        Product foundProductBinary = BinarySearch.search(products, targetIdBinary);
        System.out.println("Searching for Product ID: " + targetIdBinary);
        if (foundProductBinary != null) {
            System.out.println("Found: " + foundProductBinary);
        } else {
            System.out.println("Product not found.");
        }
        System.out.println();
        
        int targetIdNotFound = 999;
        Product notFoundProduct = BinarySearch.search(products, targetIdNotFound);
        System.out.println("Searching for Product ID: " + targetIdNotFound);
        if (notFoundProduct != null) {
            System.out.println("Found: " + notFoundProduct);
        } else {
            System.out.println("Product with ID " + targetIdNotFound + " was not found, as expected.");
        }
        
    }
}