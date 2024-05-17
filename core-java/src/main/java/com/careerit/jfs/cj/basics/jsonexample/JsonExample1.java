package com.careerit.jfs.cj.basics.jsonexample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample1 {

    public static void main(String[] args) throws JsonProcessingException {

        String str = """                
                {
                    "id": 1001,
                    "name": "Dell Inspiron 15",
                    "price": 65000.0,
                    "description": "Dell Inspiron 15 with 16GB RAM and 1TB SSD"
                }
                """;
        ObjectMapper mapper = new ObjectMapper();
        /*JsonNode node = mapper.readTree(str);
        long id = node.get("id").asLong();
        String name = node.get("name").asText();
        double price = node.get("price").asDouble();
        String description = node.get("description").asText();

        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);*/

        Product product = mapper.readValue(str, Product.class);
        System.out.println(product);
    }
}
