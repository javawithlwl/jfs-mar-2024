package com.careerit.jfs.cj.basics.reflection;

import java.lang.reflect.Field;
import java.util.Map;

public class ReflectionUtil {

        public static <T> T getInstance(Map<String,Object> map,Class<T> clazz) {
                try {
                        T obj = clazz.getDeclaredConstructor().newInstance();
                        Field[] fields = obj.getClass().getDeclaredFields();
                        for(Field field:fields) {
                                field.setAccessible(true);
                                String name = field.getName();
                                Object value = map.get(name);
                                field.set(obj, value);
                        }
                        return obj;
                } catch (Exception e) {
                        throw new RuntimeException(e);
                }
        }

}
