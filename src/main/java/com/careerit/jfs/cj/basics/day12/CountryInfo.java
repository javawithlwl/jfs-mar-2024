package com.careerit.jfs.cj.basics.day12;

public class CountryInfo {

    private String name;
    private String region;
    private long population;

    public CountryInfo(String name, String region, long population) {
        this.name = name;
        this.region = region;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
