package com.sparta.db.enums_lab;

public enum Planet {

    MERCURY("Mercury", 0.39, 0.0553),
    VENUS("Venus", 0.72, 0.815),
    EARTH("Earth", 1, 1),
    MARS("Mars", 1.52, 0.107),
    JUPITER("Jupiter", 5.20, 318),
    SATURN("Saturn", 9.54, 95.2),
    URANUS("Uranus", 19.22, 14.5),
    NEPTUNE("Neptune", 30.06, 17.1);


    private final String name;
    private final double distance;
    private final double mass;

    private final long AU = 149597870700L;
    private final long MASS_OF_EARTH = (long) (5.972 * Math.pow(10, 24));

    Planet(String name, double distance, double mass){
        this.name = name;
        this.distance = distance;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getAvgDistanceInAU() {
        return distance;
    }

    public double getMassRelativeToEarth() {
        return mass;
    }

    public long getDistanceInKilometers(){
        return (long) (distance * AU);
    }

    public long getMassInKilograms(){
        return (long) (mass * MASS_OF_EARTH);
    }

    @Override
    public String toString() {
        return (getName() + " is " + (ordinal()+1) + " planet(s) away from the sun, which is " + getAvgDistanceInAU() + " AU away from the sun. It has a mass of " + getMassRelativeToEarth() + " Earths.");
    }
}
