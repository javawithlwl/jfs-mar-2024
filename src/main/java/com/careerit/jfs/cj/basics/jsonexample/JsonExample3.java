package com.careerit.jfs.cj.basics.jsonexample;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample3 {

    public static void main(String[] args) {

        Product product = Product.builder()
                .id(1001)
                .name("Dell Inspiron 15")
                .description("Dell Inspiron 15 with 16GB RAM and 1TB SSD")
                .price(65000)
                .build();

        ObjectMapper mapper = new ObjectMapper();
        try {
            String str = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(product);
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
