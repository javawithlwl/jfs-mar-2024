package com.careerit.jfs.cj.basics.cf.mapexamples;

import java.util.*;

public class MapExample3 {

    public static void main(String[] args) {

       String data = "learning java is fun and to have fun practice java in fun way";
       String[] arr = data.split(" ");
       Map<String,Integer> map = new HashMap<>();

       for (String word : arr) {
          map.put(word, map.getOrDefault(word, 0) + 1);
       }
       System.out.println(map);
    }
}
