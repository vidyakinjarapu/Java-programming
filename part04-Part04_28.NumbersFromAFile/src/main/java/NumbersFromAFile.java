import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> numlist = new ArrayList<>();     
        
        try(Scanner reader = new Scanner(Paths.get(file))){
           
            while(reader.hasNextLine()){
                int num = Integer.valueOf(reader.nextLine());
//                System.out.println(num);
                numlist.add(num);
            }
                        
        } catch(Exception e){
            System.out.println("File not found!");
        }
        
        int count = 0;
        for(int i = 0; i < numlist.size(); i++){
            if(numlist.get(i) >= lowerBound && numlist.get(i) <= upperBound){
//                System.out.println(numlist.get(i));
                count = count + 1;
            }
        }       
        System.out.println("Numbers: " + count);
    }
}