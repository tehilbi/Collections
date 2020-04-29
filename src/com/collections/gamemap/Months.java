package com.collections.gamemap;

import java.util.HashMap;
import java.util.Map;

public class Months {
    private final int monthNum;
    private final String description;
    private final Map<String, Integer> exists;

    public Months(int monthNum, String description) {
        this.monthNum = monthNum;
        this.description = description;
        this.exists = new HashMap<>();
    }


    public void addExit(String direction, int location) {
        exists.put(direction, location);
    }

    public int getMonthNum() {
        return monthNum;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExists() {
        return new HashMap<>(exists);
    }
}
