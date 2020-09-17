package com.company;

import java.util.ArrayList;

public class League<T extends Team> {
    private String name;
    ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void addTeam(T team){
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
