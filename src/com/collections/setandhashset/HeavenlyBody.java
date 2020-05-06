package com.collections.setandhashset;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name) {
        this.name = name;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addMoon(HeavenlyBody moon) {
        this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
}
