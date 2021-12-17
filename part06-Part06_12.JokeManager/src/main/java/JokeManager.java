/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokeList;
    
    public JokeManager(){
        this.jokeList = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokeList.add(joke);
    }
    
    public String drawJoke(){
        if (jokeList.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokeList.size());
            return jokeList.get(index);
        }
    }
    
    public void printJokes(){
        for(String joke: jokeList){
            System.out.println(joke);
        }
    }
}
