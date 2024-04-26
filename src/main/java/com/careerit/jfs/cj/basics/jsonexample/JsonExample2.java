package com.careerit.jfs.cj.basics.jsonexample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample2 {

    public static void main(String[] args) throws JsonProcessingException {

        String str = """
                [
                   {
                     "id": 1001,
                     "name": "Dell Inspiron 15",
                     "price": 65000,
                     "description": "Dell Inspiron 15 with 16GB RAM and 1TB SSD"
                   },
                   {
                     "id": 1002,
                     "name": "Macbook Pro 16",
                     "price": 150000,
                     "description": "Macbook Pro 16 with 32GB RAM and 1TB SSD"
                   },
                   {
                     "id": 1003,
                     "name": "HP Pavilion 15",
                     "price": 45000,
                     "description": "HP Pavilion 15 with 8GB RAM and 512GB SSD"
                   }
                 ]
                """;

        ObjectMapper mapper = new ObjectMapper();
        /*JsonNode node = mapper.readTree(str);

        if(node.isArray()){
            for(int i=0;i<node.size();i++){
                JsonNode obj = node.get(i);
                long id = obj.get("id").asLong();
                String name = obj.get("name").asText();
                double price = obj.get("price").asDouble();
                String description = obj.get("description").asText();
                Product product = new Product();
                product.setId(id);
                product.setName(name);
                product.setPrice(price);
                product.setDescription(description);
                System.out.println(product);
            }
        }*/

        Product[] products = mapper.readValue(str, Product[].class);
        for(Product product:products){
            System.out.println(product);
        }

    }
}
