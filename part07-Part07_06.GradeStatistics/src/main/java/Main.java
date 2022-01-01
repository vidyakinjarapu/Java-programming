
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        System.out.println("Enter point totals, -1 stops:");
        ArrayList<Integer> scoreList = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            } else if(input < 0 || input > 100){
                continue;
            }
            scoreList.add(input);           
        }
        
        //Print list to seee added scores
        System.out.println(scoreList);
        
        //Grade statistics class
        GradeStatistics GS = new GradeStatistics(scoreList);
        System.out.println("Point average (all): " + GS.pointAverage());       
        System.out.println("Point average (passing): " + GS.pointAveragePassing());
        System.out.println("Pass percentage: " + GS.passPercentage());  
//        System.out.println("Grade Distribution: " + GS.gradeDistribution());
        GS.gradeDistribution();

    }    
}
