package org.example;

import java.util.HashMap;

public class Planet {
    String name = null;
    int nameOfSatellites = 0;
    double massKG = 0;
    double volumeKG3 = 0;
    int diameterKG = 0;
    int middleDistanceToSunKM = 0;
    PlanetType planetType;
    boolean observable = false;

    public Planet(String name, int nameOfSatellites, double massKG, double volumeKG3, int diameterKG, int middleDistanceToSunKM, PlanetType planetType, boolean observable) {
        this.name = name;
        this.nameOfSatellites = nameOfSatellites;
        this.massKG = massKG;
        this.diameterKG = diameterKG;
        this.middleDistanceToSunKM = middleDistanceToSunKM;
        this.planetType = planetType;
        this.observable = observable;
    }

    public HashMap<String, Object> getAttributes() {
        HashMap<String, Object> planet = new HashMap<>();
        planet.put("name", this.name);
        planet.put("numberOfSatellites", this.nameOfSatellites);
        planet.put("massKG", this.massKG);
        planet.put("volumeKG3", this.volumeKG3);
        planet.put("diameterKG", this.diameterKG);
        planet.put("middleDistanceToSunKm", this.middleDistanceToSunKM);
        planet.put("observable", this.observable);
        return planet;
    }

    public double getDensity(){
        return this.massKG / this.volumeKG3;
    }

    public boolean isOuterPlanet() {
        double UA = 149597870;
        double minDistance = 2.1 * UA;
        double maxDistance = 3.4 * UA;
        return minDistance < this.middleDistanceToSunKM && this.middleDistanceToSunKM < maxDistance;
    }
}