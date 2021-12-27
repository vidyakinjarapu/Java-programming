
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();           
        Container secondContainer = new Container();
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

            if(parts[0].equals("add")){
                firstContainer.add(amount);                
            }else if(parts[0].equals("remove")){
                secondContainer.remove(amount);
            }else if(parts[0].equals("move")){
                if(firstContainer.contains() >= amount){
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                } else {
                    secondContainer.add(firstContainer.contains()); 
                    firstContainer.remove(amount);
                }               
            }
            
            first = firstContainer.contains();
            second = secondContainer.contains();
            
        }
    }
}

    
//        Container container = new Container();
//        System.out.println(container);
//
//        container.add(50);
//        System.out.println(container);
//        System.out.println(container.contains());
//
//        container.remove(60);
//        System.out.println(container);
//
//        container.add(200);
//        System.out.println(container);  