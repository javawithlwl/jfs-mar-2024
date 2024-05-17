package com.careerit.jfs.cj.basics.day12;

import java.util.HashSet;
import java.util.Set;

public class CountryManager {

    public static void main(String[] args) {

        CountryManager obj = new CountryManager();
        CountryInfo[] arr = obj.getCountryInfo();
        // 1. Print unique region names
        // 2. Print total population of all countries
        // 3. Print country with highest population
        // 4. Print country with lowest population
        // 5. Print country name,population in ascending order of population
        Set<String> regions = new HashSet<>();
        for(CountryInfo info:arr){
            if(regions.contains(info.getRegion())){
                continue;
            }
            regions.add(info.getRegion());
            System.out.println(info.getRegion());
        }
    }

    public CountryInfo[] getCountryInfo() {
        CountryInfo[] arr = new CountryInfo[10];
        arr[0] = new CountryInfo("India", "Asia", 1350000000);
        arr[1] = new CountryInfo("USA", "North America", 330000000);
        arr[2] = new CountryInfo("China", "Asia", 1400000000);
        arr[3] = new CountryInfo("UK", "Europe", 66000000);
        arr[4] = new CountryInfo("Australia", "Australia", 25000000);
        arr[5] = new CountryInfo("Brazil", "South America", 210000000);
        arr[6] = new CountryInfo("Canada", "North America", 38000000);
        arr[7] = new CountryInfo("Russia", "Europe", 145000000);
        arr[8] = new CountryInfo("South Africa", "Africa", 57000000);
        arr[9] = new CountryInfo("Japan", "Asia", 126000000);
        return arr;
    }
}
