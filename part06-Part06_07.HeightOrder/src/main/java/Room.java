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
public class Room {
    private ArrayList<Person> personList;
    
    public Room(){
        this.personList = new ArrayList<>();
    }
    
    public void add(Person person){
        this.personList.add(person);
    }
    
    public boolean isEmpty(){
        if(this.personList.isEmpty()){
            return true;
        }
        return false;
    }
    
    public Person shortest(){
        if(this.personList.isEmpty()){
            return null;
        }
        
        Person refObj = this.personList.get(0);
        
        for(Person person: this.personList){
            if(refObj.getHeight() > person.getHeight()){
                refObj = person;
            }           
        }
        return refObj;
    }
    
    public Person take(){
        if(this.personList.isEmpty()){
            return null;
        }
        Person obj = this.shortest();
        this.personList.remove(obj);
        return obj;
    }
    
    public ArrayList<Person> getPersons(){
        return this.personList;
    }
}
