/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Games {
    private String home;
    private String oppose;
    private int homeScore;
    private int opposeScore;
      
    public Games(String homeTeam, String opposeTeam, int homeScore, int opposeScore){
        this.home = homeTeam;
        this.oppose = opposeTeam;
        this.homeScore = homeScore;
        this.opposeScore = opposeScore;
    }
    
    public String getHome(){
        return this.home;
    }
    
    public String getOppose(){
        return this.oppose;
    }
    
    public boolean IsWinner(String team){
        if(team.equals(this.home) && this.homeScore > this.opposeScore){
            return true;
        } 
        if(team.equals(this.oppose) && this.opposeScore > this.homeScore){
            return true;
        }
        return false;
    }    
}
