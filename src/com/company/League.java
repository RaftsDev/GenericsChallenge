package com.company;

import java.util.ArrayList;

public class League {
    private String name;
    ArrayList<Team> league = new ArrayList<Team>();

    public League(String name) {
        this.name = name;
    }

    public void addTeam(Team team){
        this.league.add(team);
    }

    public void showTable() {
        System.out.println("League:\n"+
                "----------------------");
        for( Team i: this.league) {
            System.out.println(i.getName());
        }
        System.out.println("----------------------");
    }
}
