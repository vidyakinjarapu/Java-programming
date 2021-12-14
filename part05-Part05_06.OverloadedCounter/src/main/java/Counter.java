/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Counter {
    private int counter;
    
    //Constructor function
    public Counter(){
        this.counter = 0;
    }
    
    public Counter(int startValue){
        this.counter = startValue;
    }
    
    //Methods
    public int value(){
        return this.counter;
    }
    
    public void increase(){
//        this.startValue = this.startValue + 1;
        this.increase(1);
    }
    public void increase(int increaseby){
        if(increaseby > 0){        
            this.counter = this.counter + increaseby;
        } else {
            this.counter = this.counter;
        }
    }
    
    public void decrease(){
//        this.startValue = this.startValue - 1;
        this.decrease(1);
    }
    public void decrease(int decreaseby){
        if(decreaseby > 0){
            this.counter = this.counter - decreaseby;
        } else {
            this.counter = this.counter;
        }
    }
}