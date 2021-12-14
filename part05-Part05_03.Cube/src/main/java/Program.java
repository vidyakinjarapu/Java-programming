
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        Cube c1 = new Cube(4);
        System.out.println(c1.volume());
        System.out.println(c1);
        
        System.out.println("");
        
        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
    }
}
