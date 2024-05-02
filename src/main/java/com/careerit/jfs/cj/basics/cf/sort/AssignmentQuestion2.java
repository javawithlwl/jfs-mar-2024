package com.careerit.jfs.cj.basics.cf.sort;

import java.util.List;
import java.util.Map;

record Country(String name, String region, double population) {
}

public class AssignmentQuestion2 {

    public static void main(String[] args) {
        List<Country> countries = getAllCountryDetails();
        Map<String,List<Country>> map = getRegionWiseCountryDetails(countries);

    }

    // Sort the countries based on the population, region, name
    public static List<Country> getSortedCountryDetails(List<Country> countries){
        return null;
    }

    public static Map<String,List<Country>> getRegionWiseCountryDetails(List<Country> countries){
        return null;
    }
    private static List<Country> getAllCountryDetails() {
        return List.of(new Country("India", "Asia", 1380000000),
                new Country("China", "Asia", 1400000000),
                new Country("USA", "North America", 330000000),
                new Country("Brazil", "South America", 210000000),
                new Country("Russia", "Europe", 145000000),
                new Country("Nigeria", "Africa", 200000000),
                new Country("Japan", "Asia", 126000000),
                new Country("Germany", "Europe", 83000000),
                new Country("UK", "Europe", 67000000),
                new Country("France", "Europe", 65000000),
                new Country("Italy", "Europe", 60000000),
                new Country("South Africa", "Africa", 60000000),
                new Country("South Korea", "Asia", 52000000),
                new Country("Spain", "Europe", 47000000),
                new Country("Argentina", "South America", 45000000),
                new Country("Canada", "North America", 38000000),
                new Country("Australia", "Australia", 25000000),
                new Country("Saudi Arabia", "Asia", 34000000),
                new Country("Turkey", "Asia", 33000000),
                new Country("Iran", "Asia", 82000000),
                new Country("Poland", "Europe", 38000000),
                new Country("Pakistan", "Asia", 220000000),
                new Country("Netherlands", "Europe", 17000000),
                new Country("Bangladesh", "Asia", 160000000),
                new Country("Philippines", "Asia", 110000000)
        );
    }
}
