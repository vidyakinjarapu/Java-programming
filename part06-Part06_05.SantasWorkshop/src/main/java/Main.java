
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter", 5);
        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());
        System.out.println("Gift" + book);
        
        Gift bag = new Gift("Bag", 20);
        
        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(bag);
        System.out.println(gifts.totalWeight());
    }
}
