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
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("add")){
                System.out.print("To add: ");
                String task = scanner.nextLine();
                list.add(task);
                
            } else if(command.equals("list")){               
                list.print();
                
            } else if(command.equals("completed")){
                System.out.print("Which task was completed?");
                int num = Integer.valueOf(scanner.nextLine());
                list.remove(num);
                
            } else if(command.equals("remove")){
                System.out.println("Which one is removed? ");
                int num = Integer.valueOf(scanner.nextLine());
                list.remove(num);
                
            } else if(command.equals("stop")){
                break;
            }
        }
    }
    
}

