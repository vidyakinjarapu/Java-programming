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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict){
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if(input.equals("add")){
                add();
            } else if(input.equals("search")){
                search();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
    public void add(){
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        dict.add(word, translation);
    }
    public void search(){
        System.out.println("to be translated: ");
        String word = scanner.nextLine(); 
        if(dict.translate(word) == null){
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translated: " + dict.translate(word));
        }   
    }
}
