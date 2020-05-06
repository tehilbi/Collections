package com.collections.gamemap;

import java.util.HashMap;
import java.util.Map;

public class Locations {
    private final String description;
    private final Map<String, Integer> exits;

    public Locations(String description, Map<String, Integer> exits) {
        this.description = description;
        if (exits != null) {
            this.exits = new HashMap<>(exits);
        } else {
            this.exits = new HashMap<>();
        }
        this.exits.put("Q", 0);
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }

}
