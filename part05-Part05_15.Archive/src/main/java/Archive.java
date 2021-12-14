/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String ID, String name){
        this.identifier = ID;
        this.name = name;
    }
    public String getName(){
        return this.identifier + ": " + this.name;
    }
    
    public boolean equals(Object compare){
        if(this == compare){
            return true;
        }
        if(!(compare instanceof Archive)){
            return false;
        }
        
        //Changing instance into Archive
        Archive compared = (Archive) compare;
        if(this.identifier.equals(compared.identifier)){
            return true;
        }
        return false;
    }
}
