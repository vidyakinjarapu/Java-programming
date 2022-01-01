/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Birds> birds;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }
    
    public void start(){
        
        while(true){
            System.out.print("?");
            String cmd = scanner.nextLine();
            
            if(cmd.equals("Add")){
                System.out.print("Name: ");
                String bird = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scanner.nextLine();
                birds.add(new Birds(bird, latin));
            }

            if(cmd.equals("Observation")){
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                for(Birds b: this.birds){
                    if(bird.equals(b.getBird())){
                        b.Observation();
                    }
                } 
                
            }

            if(cmd.equals("All")){
                for(int i = 0; i < this.birds.size(); i++){
                    System.out.println(this.birds.get(i).toString());
                }
            }

            if(cmd.equals("One")){
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                for(Birds b: this.birds){
                    if(bird.equals(b.getBird())){
                        System.out.println(b.toString());
                    }
                }              
            }
            
            if(cmd.equals("Quit")){
                break;
            }
        }
        
    }      
}
