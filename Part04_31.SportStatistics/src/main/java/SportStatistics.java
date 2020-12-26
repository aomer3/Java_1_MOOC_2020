/*
Write a program that prompts the user for a filename, after which it reads the match 
statistics from the file. The program then prompts the user for the name of a team, 
and prints the data specified in the following parts for that team.
 
Part 1: Games Played
Implement the ability to output the number of games played by any given team. We're 
using the above-mentioned data.csv file.
 
Output:
File:
data.csv
Team:
ENCE
Games: 6
 
Part 2: Wins and Losses
Extend the program so that it has the ability to print the number of wins and losses 
of a given team. The winner of a game is the team that has gained more points from it.
 
You may assume that the games cannot be tied. Below, we're using the above-mentioned 
data.csv file.

Output:
File:
data.csv
Name:
ENCE
Games: 6
Wins: 3
Losses: 3
*/
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class SportStatistics {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<Game> record = getGame(file); //After method returns the list of objects, it is copied over to another list.
 
        System.out.println("Team: ");
        String team = scan.nextLine(); 
        
        //These methods return how many games a team played, has won and has lost.
        int gamesPlayed = getGamesPlayed(record, team);
        int gamesWon = getGamesWon(record, team);
        int gamesLost = getGamesLost(record, team);
        
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + gamesLost);
 
    }
    
    //This method takes in the file name given by user and saves file details into a list of objects.
    public static ArrayList<Game> getGame(String file){
        ArrayList<Game> games = new ArrayList<>();
        
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String input = reader.nextLine();
                String[] parts = input.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                
                games.add(new Game(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
        }
        catch(Exception e){
            System.out.println("Error: File " + file + " not found.");
        }
        
        return games;
    }
    
    public static int getGamesPlayed(ArrayList<Game> record, String team){
        int gamesPlayed = 0;
        for(Game game: record){
            if (game.getHomeTeam().equals(team) || game.getVisitngTeam().equals(team)){
                gamesPlayed++;
            }
        }
        
        return gamesPlayed;
    }
    
    public static int getGamesWon(ArrayList<Game> record, String team){
        int gamesWon = 0;
        for(Game game: record){
            if (game.getHomeTeam().equals(team) || game.getVisitngTeam().equals(team)){
                if(game.getHomeTeam().equals(team) && game.getHomePoints() > game.getVisitingPoints()){
                    gamesWon++;
                }
                if(game.getVisitngTeam().equals(team) && game.getVisitingPoints() > game.getHomePoints()){
                    gamesWon++;
                }
            }
        }
        
        return gamesWon;
    }
    
    public static int getGamesLost(ArrayList<Game> record, String team){
        int gamesLost = 0;
        for(Game game: record){
            if (game.getHomeTeam().equals(team) || game.getVisitngTeam().equals(team)){
                if(game.getHomeTeam().equals(team) && game.getHomePoints() < game.getVisitingPoints()){
                    gamesLost++;
                }
                if(game.getVisitngTeam().equals(team) && game.getVisitingPoints() < game.getHomePoints()){
                    gamesLost++;
                }
            }
        }
        
        return gamesLost;
    }
  
 
}