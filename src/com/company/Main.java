package com.company;

public class Main {

    public static void main(String[] args) {
        BasketBallTeam<BasketBallTeam> chBulls = new BasketBallTeam("Ch Bulls");
        BasketBallTeam<BasketBallTeam> nycBulls = new BasketBallTeam("NYC Bulls");

        HockeyTeam<HockeyTeam> pitPing = new HockeyTeam("Pit Ping");
        HockeyTeam<HockeyTeam> atlanticPing = new HockeyTeam("Atlantic Ping");

        //Adding to League

        League<BasketBallTeam> basketballLeague = new League("Basketball basketballLeague");
        basketballLeague.addTeam(chBulls);
        basketballLeague.addTeam(nycBulls);
        //basketballLeague.addTeam(pitPing);//Hockey team in same basketballLeague.

        basketballLeague.showTable();

    }
}
