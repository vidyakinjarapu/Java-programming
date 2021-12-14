
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account vidya_account = new Account("Vidya's account", 100.00);
        
//        System.out.println("Intitial state");
        System.out.println(vidya_account);
        
        vidya_account.deposit(20.00);
        System.out.println(vidya_account);
        
    }
}
