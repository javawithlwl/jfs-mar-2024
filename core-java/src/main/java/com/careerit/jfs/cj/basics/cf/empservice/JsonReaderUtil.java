package com.careerit.jfs.cj.basics.cf.empservice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReaderUtil {

    public <T> T readJson(String fileName, TypeReference<T> typeReference) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(this.getClass().getResourceAsStream(fileName), typeReference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
