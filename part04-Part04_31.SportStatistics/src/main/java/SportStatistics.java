
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Filename: ");
        String file = scan.nextLine();
        
        ArrayList<Games> games = readFromFile(file);
        
        System.out.println("Team: ");
        String team = scan.nextLine();
             
        int wins = 0;
        int losses = 0;
        int count = 0;
        
        //counting the number of games
        for(Games game: games){
            if(team.equals(game.getHome()) || team.equals(game.getOppose())){
                count += 1;
            }
        }
        
        //counting number of wins
        for(Games game:games){
            if(game.IsWinner(team)){
                wins++;
            }
        }
        losses = count - wins;
    
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
        
        //Reading data
    public static ArrayList<Games> readFromFile(String fileName){
        ArrayList<Games> games = new ArrayList<>();
        try(Scanner scan = new Scanner(Paths.get(fileName))){
            while(scan.hasNextLine()){
                
                String data = scan.nextLine();
                String[] parts = data.split(",");

                String team1 = parts[0];
                String team2 = parts[1];
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);
                games.add(new Games(team1, team2, score1, score2));
            }
                                       

//                if(team1.equals(team)){
//                    count = count + 1;
//                    if(score1 > score2){
//                        wins += 1;
//                    } else {
//                        losses = losses + 1;
//                    }
//                } else if(team2.equals(team)){
//                    count = count + 1;
//                    if(score2 > score1){
//                        wins += 1;
//                    } else {
//                        losses = losses + 1;
//                    }
//                    
//                }
                        
        } catch(Exception e){
            System.out.println("File not found " + e.getMessage());
        }
        return games;   
    }
}