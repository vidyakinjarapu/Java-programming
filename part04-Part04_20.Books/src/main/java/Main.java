import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Books> BookList = new ArrayList<>();
        
        while(true){
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.print("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication Year: ");
            int pub = Integer.valueOf(scanner.nextLine());
            
            BookList.add(new Books(name, page, pub));           
        }
        
        System.out.print("What information will be printed?");
        String input = scanner.nextLine();
        if(input.equals("everything")){
            for(Books book:BookList){
                System.out.println(book);
            }
        } else if(input.equals("name")){
            for(Books book:BookList){
                System.out.println(book.getTitle());
            }
        }

    }
}
