/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Room {
    private String code;
    private int seats;
    
    public Room(String classCode, int numberOfSeats){
        this.code = classCode;
        this.seats = numberOfSeats;
    }
    public void printRoom(){
        System.out.println(this.seats + " seats for the class " + this.code);
    }
}
