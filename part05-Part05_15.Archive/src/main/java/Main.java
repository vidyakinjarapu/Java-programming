
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Archive> archives = new ArrayList<>(); 
        
        while(true){
            System.out.println("Identifier?(empty will stop)");
            String ID = scanner.nextLine();
            if(ID.equals("")){
                break;
            } else {
                System.out.println("Name?(empty will stop)");
                String name = scanner.nextLine();
                if(name.equals("")){
                    break;
                }                
                Archive a1 = new Archive(ID, name);
                if(archives.contains(a1)){
                    System.out.println("Object is already there!");
                } else {
                    archives.add(a1);
                }
            }
        }
        //printing
        System.out.println("==Items==");
        
        for(Archive archive: archives){
            System.out.println(archive.getName());
        }                
    }
}
