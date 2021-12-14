
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message m1 = new Message("sagar", "Hello, good morning");
        Message m2 = new Message("Vidya", "Meet me at Newyork"); 
        MessagingService ms = new MessagingService();
        System.out.println(ms.getMessages());
//        Message m = new Message("sender", "message");
        ms.add(m1);
        ms.add(m2);
        System.out.println(ms.getMessages());
    }
}
