
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);
        System.out.println(leo);
        
        System.out.println("==========================================");
        
        Pet baby = new Pet("baby", "juli");
        Person Dhruv = new Person("Dhruv");        
        System.out.println(Dhruv);
        System.out.println("==========================================");
        
        Person none = new Person();
        System.out.println(none);
        System.out.println("==========================================");
        
    }
}
