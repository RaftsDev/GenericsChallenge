package com.company;

public class Main {

    public static void main(String[] args) {
        BasketBallTeam chBulls = new BasketBallTeam("Ch Bulls");
        BasketBallTeam nycBulls = new BasketBallTeam("NYC Bulls");

        HockeyTeam pitPing = new HockeyTeam("Pit Ping");
        HockeyTeam atlanticPing = new HockeyTeam("Atlantic Ping");

        //Adding to League

        League league = new League("Basketball league");
        league.addTeam(chBulls);
        league.addTeam(nycBulls);
        league.addTeam(pitPing);//Hockey team in same league.

        league.showTable();

    }
}
