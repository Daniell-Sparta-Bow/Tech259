package com.sparta.db.enums_lab;

public class PlanetConsumer {

    public static void main(String[] args) {
        Planet earth = Planet.EARTH;

        Planet superEarth = Planet.valueOf("EARTH");

        System.out.println(superEarth.getAvgDistanceInAU());

        boolean isSameWithEquals = superEarth == earth;
        boolean isSameWithDotEquals = superEarth.equals(earth);

        System.out.println(isSameWithEquals);
        System.out.println(isSameWithDotEquals);


        double marsDistance = Planet.MARS.getAvgDistanceInAU();
        double earthDistance = Planet.EARTH.getAvgDistanceInAU();

        if(marsDistance > earthDistance){
            System.out.println(Planet.MARS.getName() + " is further from the Sun than " + Planet.EARTH.getName());
        }

        for (Planet planet : Planet.values()){
            System.out.println(planet.toString());
        }


    }


}
