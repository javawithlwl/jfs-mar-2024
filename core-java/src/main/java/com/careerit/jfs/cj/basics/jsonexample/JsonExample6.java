package com.careerit.jfs.cj.basics.jsonexample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

public class JsonExample6 {

    public static void main(String[] args) {

        List<Transaction> transactionList = getTransactions();
        File file = new File("transactions.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Double.class, new DecimalFormatter());
        mapper.registerModule(module);
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(System.out, transactionList);
            System.out.println("Transactions are written to file transactions.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Transaction> getTransactions() {
        return List.of(
                Transaction.builder().id(1001).from("Smith").to("John").amount(1000.0).dateTime(LocalDateTime.now().minusHours(1)).build(),
                Transaction.builder().id(1002).from("John").to("Smith").amount(2000.50).dateTime(LocalDateTime.now().minusHours(2)).build(),
                Transaction.builder().id(1003).from("Smith").to("John").amount(3000.12234).dateTime(LocalDateTime.now().minusHours(3)).build(),
                Transaction.builder().id(1004).from("John").to("Smith").amount(4000.87675).dateTime(LocalDateTime.now()).build(),
                Transaction.builder().id(1005).from("Smith").to("John").amount(5000.78).dateTime(LocalDateTime.now().plusHours(1)).build()
        );
    }
}
