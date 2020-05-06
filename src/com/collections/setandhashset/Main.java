package com.collections.setandhashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Phobos");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Jupiter");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Europa");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Ganymede");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Callisto");
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Saturn");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto");
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody jupiterMoon : body.getSatellites()) {
            System.out.println("\t " + jupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t " + moon.getName());
        }
    }
}
