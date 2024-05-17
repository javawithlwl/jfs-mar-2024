package com.careerit.jfs.cj.basics.cf.iplstats;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public final class JsonReaderUtil {

    private JsonReaderUtil() {
    }

    public static List<Player> loadPlayers(String fileName){
        ObjectMapper mapper = new ObjectMapper();
        List<Player> list = new ArrayList<>();
        try {
            list =  mapper.readValue(JsonReaderUtil.class.getResource(fileName), new TypeReference<List<Player>>() {
            });
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

}
