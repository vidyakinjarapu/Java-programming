
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c1 = new Counter(30);
        c1.decrease();
        System.out.println(c1.value());
        c1.decrease();
        System.out.println(c1.value());
        
    }
}
