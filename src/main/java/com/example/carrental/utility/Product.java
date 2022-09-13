package com.example.carrental.utility;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

 class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList();
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));
       List<Integer> newlist= productsList.stream().filter(product->product.price>1000).map(product->product.price).collect(Collectors.toList());

        System.out.println(newlist);

//        System.out.println(productPriceList2);
    }
}
