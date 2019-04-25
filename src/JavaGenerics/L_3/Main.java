package JavaGenerics.L_3;
public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footbalLeguague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,0);

        adelaideCrows.matchResult(fremantle,2,1);

        footbalLeguague.add(adelaideCrows);
        footbalLeguague.add(melbourne);
         footbalLeguague.add(hawthorn);
         footbalLeguague.add(fremantle);
      // footbalLeguague.add(baseballTeam);
        footbalLeguague.showLeagueTable();



        BaseballPlayer  pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(pat);
        rawTeam.addPlayer(beckham);

        footbalLeguague.add(rawTeam);

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(adelaideCrows);
        rawLeague.add(baseballTeam);
        rawLeague.add(rawTeam);


    }
}
