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

        // Testing Error nonType variable
        //basketballLeague.addTeam(pitPing);//Hockey team in same basketballLeague. Error popup.

        basketballLeague.showTable();

        League<HockeyTeam> hockeyTeamLeague = new League<>("Hockey league");
        hockeyTeamLeague.addTeam(pitPing);
        hockeyTeamLeague.addTeam(atlanticPing);

        // Testing Error nonType variable
        //hockeyTeamLeague.addTeam(chBulls); //Error popup.

        hockeyTeamLeague.showTable();


    }
}
