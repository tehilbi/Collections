package com.collections.gamemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Locations> locations = new HashMap<>();

    public static void main(String[] args) {
        //Change the program to allow [layers to type full words, or phrases, then move to the
        //correct location based upon their input.
        //The player should be able to type commands such as "Go West", "run South", or just "East"
        //and the program will move to the appropriate location if there is one. As at present, an
        //attempt to move in an invalid direction should print a message and remain in the same place.
        //
        //Single letter commands (N, W, S, E, Q) should still be available.

        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Locations(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Locations(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Locations(2, "You are at the top of a hill"));
        locations.put(3, new Locations(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Locations(4, "You are in a valley beside a stream"));
        locations.put(5, new Locations(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cant go in that direction");
            }
        }
    }
}
