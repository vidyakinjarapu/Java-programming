/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Birds {
    private String name;
    private String latinName;
    private int obs = 0;
    
    public Birds(String name, String latin){
        this.name = name;
        this.latinName = latin;
    }
    
    public String getBird(){
        return this.name;
    }
    
    public void Observation(){
        this.obs = this.obs + 1;
    }
    public int getObj(){
        return this.obs;
    }
    
    @Override
    public String toString(){
        return this.name + "(" + this.latinName + "):" + this.getObj() + " observations" ;
    }
}