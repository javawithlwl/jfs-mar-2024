package com.careerit.jfs.cj.basics.staticandfinal;

class Planet {
    private final double mass;   // in kilograms
    private final double radius; // in meters
    public static final double G = 6.67300E-11;

    public Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }
    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}

public class FinalKeyWordExample {


    public static void main(String[] args) {
        Planet mars = new Planet(6.4191E23, 3.3972E6);
        Planet earth = new Planet(5.976E24, 6.37814E6);
        double earthWeight = 175;
        double mass = earthWeight/earth.surfaceGravity();
        System.out.println("Weight on Mars : "+mars.surfaceWeight(mass));

    }

}
