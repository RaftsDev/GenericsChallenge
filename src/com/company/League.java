package com.company;

import java.util.ArrayList;

public class League {
    private String name;
    ArrayList<Team> team = new ArrayList<Team>();

    public League(String name) {
        this.name = name;
    }
}
