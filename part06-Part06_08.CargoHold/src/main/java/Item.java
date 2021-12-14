/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Item {
    private String name;
    private int weight;
    
    public Item(String item_name, int item_Weight){
        this.name = item_name;
        this.weight = item_Weight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public String toString(){
        return this.name + "(" + this.weight + " kg)";
    }
}
