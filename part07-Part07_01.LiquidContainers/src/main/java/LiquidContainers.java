
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0; 
        
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
                       
            String parts[] = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            // adding
            if(parts[0].equals("add") && amount > 0){
                first = first + amount;
                if(first > 100){
                    first = 100;
                }
            //moving
            } else if(parts[0].equals("move") && amount > 0){
                if(amount > first){
                    second = first;
                    first = 0;
                }else if(amount >= 100){
                    first = 0;
                    second = 100;
                } else if(amount + second > 100) {
                    first = first;
                    second = 100;
                } else if(second < 100){
                    first = first - amount;
                    second = second + amount;               
                }
             // removing   
            } else if(parts[0].equals("remove") && amount > 0){
                second = second - amount;
                if(second < 0){
                    second = 0;
                }
            } else {
                System.out.println("There should be add/move/remove methods");
            }
        }
    }
}
