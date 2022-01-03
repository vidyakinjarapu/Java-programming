/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
import java.nio.file.Paths;
import java.util.*;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipeList;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.recipeList = new ArrayList<>();
        
    }
    
    public void start(){
        
        //Reading inputs       
        System.out.print("File to read: ");
        String file = scanner.nextLine();        
        
        try(Scanner sc = new Scanner(Paths.get(file))){ 
            
            while(sc.hasNextLine()){               
                ArrayList<String> Ingradients = new ArrayList<>(); 
                
                String recipe = sc.nextLine();
                System.out.println(recipe);
                int time = Integer.valueOf(sc.nextLine());
                System.out.println(time);                                                 
                while(sc.hasNextLine()){
                    String ing = sc.nextLine();
                    if(ing.isEmpty()){
                        break;
                    }
                    System.out.println(ing);
                    Ingradients.add(ing);                     
                }
                System.out.println("");
                this.recipeList.add(new Recipe(recipe, time, Ingradients));
            }
        } catch(Exception e){   
            System.out.println("Error:" + e);
        }
 
    //Output based on command
        System.out.println("Commands:\n" +
                            "list - lists the recipes\n" +
                            "stop - stops the program\n" +
                            "find name - searches recipes by name\n" +
                            "find cooking time - searches recipes by cooking time\n" +
                            "find ingredient - searches recipes by ingredient");
        
        while(true){
            System.out.print("Enter command:");
            String cmd = scanner.nextLine();
            
            if(cmd.equals("list")){
                for(Recipe rec: this.recipeList){
                    System.out.println(rec.toString());
                }
            }
            
            if(cmd.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int cookTime = Integer.valueOf(scanner.nextLine());
                for(Recipe rec: this.recipeList){
                    if(rec.getTime() <= cookTime){
                        System.out.println(rec.toString());
                    }
                }   
            }
            
            if(cmd.equals("find name")){
                System.out.print("Searched word: ");
                String search = scanner.nextLine();
                System.out.println("Recipes: ");
                for(Recipe rec: this.recipeList){
                    if(rec.getRecipe().contains(search)){
                        System.out.println(rec.toString());
                    }
                }        
            }
            
            if(cmd.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ing = scanner.nextLine();
                for(Recipe rec: this.recipeList){
                    if(rec.searchIngradient(ing)){
                        System.out.println(rec.toString());
                    }
                }
            }
            
            if(cmd.equals("stop")){
                break;
            }
        }
    }
}
