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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public int totWeight(){
        int totWeight = 0;
        for(Suitcase suitcase: suitcases){
            totWeight += suitcase.totalWeight();
        }
        return totWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totWeight()+suitcase.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);        
        }
    }
    
    public void printItems(){
        for(Suitcase suit: suitcases){
            suit.printItems();
        }   
    }
    
    @Override
    public String toString(){
        if(this.suitcases.isEmpty()){
            return "Hold is empty";
        }
        return suitcases.size() + " suitcases (" + this.totWeight() + " kg)";
    }
    
}