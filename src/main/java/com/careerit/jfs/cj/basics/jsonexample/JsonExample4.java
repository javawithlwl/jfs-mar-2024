package com.careerit.jfs.cj.basics.jsonexample;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample4 {

    public static void main(String[] args) {

            Product product1 = Product.builder()
                    .id(1001)
                    .name("Dell Inspiron 15")
                    .description("Dell Inspiron 15 with 16GB RAM and 1TB SSD")
                    .price(65000)
                    .build();
            Product product2 = Product.builder()
                    .id(1002)
                    .name("Macbook Pro 16")
                    .description("Macbook Pro 16 with 32GB RAM and 1TB SSD")
                    .price(150000)
                    .build();
            Product product3 = Product.builder()
                    .id(1003)
                    .name("HP Pavilion 15")
                    .description("HP Pavilion 15 with 8GB RAM and 512GB SSD")
                    .price(45000)
                    .build();

            Product[] products = {product1,product2,product3};

        ObjectMapper mapper = new ObjectMapper();
        try {
            String str = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(products);
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
