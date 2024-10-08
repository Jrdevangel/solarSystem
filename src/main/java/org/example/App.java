package org.example;

import org.example.Planet;

import java.util.Map;

public class App {

    public static void main(String[] args){

        Planet saturn = new Planet("Saturn", 146, 5.683, 8.2713, 120536, 886, PlanetType.GASEOUS, true);
        Planet mercury = new Planet("Mercury", 0, 3.285, 6.083, 4879, PlanetType.TERRESTRIAL);

        for (Map.Entry<String, Object> entry : saturn.getAttributes().entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Density: " + saturn.getDensity());
        System.out.println("It's a outer planet: " + saturn.isOuterPlanet());

        System.out.println("--------------------");
        System.out.println("--------------------");
        for (Map.Entry<String, Object> entry : mercury.getAttributes().entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Density " + mercury.getDensity());
        System.out.println("It's a outer planet" + mercury.isOuterPlanet());
    }
}
