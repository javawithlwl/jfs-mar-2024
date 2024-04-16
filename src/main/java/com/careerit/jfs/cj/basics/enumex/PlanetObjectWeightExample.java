package com.careerit.jfs.cj.basics.enumex;

public class PlanetObjectWeightExample {

    public static void main(String[] args) {

        double earthWeight = 75;
        double mass = earthWeight/Planet.EARTH.surfaceGravity();

        for(Planet planet: Planet.values()){
            System.out.printf("Your weight on %s is %f%n", planet, planet.surfaceWeight(mass));
        }

    }
}
