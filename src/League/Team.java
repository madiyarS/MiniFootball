package League;

import People.Coach;
import People.Director;
import People.Player;

import java.util.ArrayList;

public class Team {
    private String name;
    private Coach coach;
    private Director director;
    private int budget;
    private ArrayList<Player> players;
    private boolean inLeague;

    public Team(String name, Coach coach, Director director) {
        this.name = name;
        this.budget = 10000;
        this.players = new ArrayList<Player>();
        this.inLeague = false;
        this.coach = coach;
        this.director = director;
    }

    public String getTeamInfo(){
        return getName() + "\n" + getPlayers() + Integer.toString(getBudget());
    }

    public String getName() {
        return name;
    }

    private int getBudget() {
        return budget;
    }

    public void subsBudget(){
        budget-=200;
        director.subsBudget();
    }

    private String getPlayers() {
        String str="";
        for (Player player: players) {
            str+=player.getName()+"\n";
        }
        return str;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public boolean isInLeague() {
        return inLeague;
    }

    public void setInLeague(boolean inLeague) {
        this.inLeague = inLeague;
    }
}
