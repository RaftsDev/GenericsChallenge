package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played=0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println("Player: "+ player.getName()+"is already in a team.");
            return false;
        }else {
            System.out.println("Player: "+ player.getName()+" is picked for a team.");
            members.add(player);
            return true;
        }
    }

    public int numPlayers(){
        return members.size();
    }

    public void matchResult(Team opponent,int ourScore, int theirScore){
        if(ourScore < theirScore){
            lost++;
        }else if(ourScore == theirScore){
            tied++;
        }else {
            won++;
        }
        played++;
        if(opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return won*2+tied;
    }
}
