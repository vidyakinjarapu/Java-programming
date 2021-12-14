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

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight(){
        int totWeight = 0;
        for(Item item: items){
            totWeight+= item.getWeight();
        }
        return totWeight;
    }
    
    public void addItem(Item item){      
        if(this.totalWeight()+item.getWeight() <= this.maxWeight){
            this.items.add(item);        
        }
    }
    
    public void printItems(){
        for(Item item: items){
            System.out.println(item);
        }
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item rObj = this.items.get(0);
        for(Item item: this.items){
            if(item.getWeight() > rObj.getWeight()){
                rObj = item;
            }
        }
        return rObj;
    }
    
@Override
    public String toString(){
        int totWeight = 0;
        if(this.items.isEmpty()){
            return "no items (" + totWeight + " kg)";
        }        
        for(Item item: items){
            totWeight+= item.getWeight();
        }
        if (this.items.size() == 1){
            return this.items.size() + " item (" + totWeight + " kg)";        
        }
        return this.items.size() + " items (" + totWeight + " kg)";        
    }
}
