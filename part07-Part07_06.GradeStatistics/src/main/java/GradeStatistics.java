/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
import java.util.*;

public class GradeStatistics {
    private ArrayList<Integer> list;
    
    public GradeStatistics(ArrayList<Integer> list){
        this.list = list;
    }
    
    public double pointAverage(){
        int sum = 0;
        for(int num: this.list){
            sum += num;
        }
//        System.out.println(sum);
//        System.out.println(this.list.size());
        double avg = sum * 1.0 / this.list.size();
        return avg;
        
    }
    
    public double pointAveragePassing(){
        int sum = 0;
        int count = 0;
        for(int num: this.list){
            if(num >= 50){
                sum = sum + num;
                count = count + 1;
            }
        }
//        System.out.println(sum / count);
        return sum / count;
        
    }
    
    public double passPercentage(){
        int count = 0;
        for(int num: this.list){
            if(num >= 50){
                count++;
            }
        }
//        System.out.println(count);
        return 100 * (count * 1.0 / list.size());
    }
    
    
    public void gradeDistribution(){
        int fives = 0;
        int fours = 0;
        int threes = 0;
        int twos = 0;
        int ones = 0;
        int zeros = 0;
        for(int num: this.list){
            if(num < 50){
                zeros += 1;
            } else if(num < 60){
                ones += 1;
            } else if(num < 70){
                twos += 1;
            } else if(num < 80){
                threes += 1;
            } else if(num < 90){
                fours += 1;
            } else {
                fives += 1;
            }
        }
        ArrayList<Integer> GradeList = new ArrayList<>();
        GradeList.add(zeros);
        GradeList.add(ones);
        GradeList.add(twos);
        GradeList.add(threes);
        GradeList.add(fours);
        GradeList.add(fives);
//        System.out.println(GradeList);
        //Printing stars
        for(int i = GradeList.size()- 1; i >= 0; i--){
            System.out.print(i + ": ");
            int item = GradeList.get(i);
            for(int j = 0; j < item; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
