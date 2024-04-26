package com.careerit.jfs.cj.basics.jsonexample;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class JsonExample5 {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try{
            List<PlayerDetails> players = mapper
                    .readValue(JsonExample5.class.getResourceAsStream("/players.json"), new TypeReference<List<PlayerDetails>>() {
            });
            System.out.println("Total players : "+players.size());
            System.out.println("Creating a new player json file");
            File file = new File("players_new.json");
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, players);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
