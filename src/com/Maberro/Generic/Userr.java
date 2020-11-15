package com.Maberro.Generic;

public class Userr implements Comparable<Userr>{
    private int points;
    public Userr(int points) {
        this.points = points;
    }


    @Override
    public int compareTo(Userr other) {
        return points- other.points;
    }

    @Override
    public String toString() {
        return "points="+points;
    }
}
