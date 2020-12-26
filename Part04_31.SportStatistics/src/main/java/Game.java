public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;
    
    public Game(String homeTeam, String visitingTeam, int homePoints, int visitingPoints){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }
    
    public String getVisitngTeam(){
        return this.visitingTeam;
    }
    
    public int getHomePoints(){
        return this.homePoints;
    }
    
    public int getVisitingPoints(){
        return this.visitingPoints;
    }
    
    public String toString(){
        return this.homeTeam + ", " + this.visitingTeam + ", " + this.homePoints + ", " + this.visitingPoints;
    }
}