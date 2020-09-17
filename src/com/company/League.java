package com.company;

import java.util.ArrayList;

public class League {
    private String name;
    ArrayList<Team> league = new ArrayList<Team>();

    public League(String name) {
        this.name = name;
    }

    public void showTable() {
        for( Team i: this.league) {
            System.out.println("League:"+i.getName());
        }
    }
}
