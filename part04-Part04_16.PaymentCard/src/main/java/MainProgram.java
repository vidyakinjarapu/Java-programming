
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
//        PaymentCard card = new PaymentCard(5.0);
//        System.out.println(card);
//        
//        card.eatAffordably();
//        System.out.println(card);
//        
//        card.eatHeartily();
//        card.eatAffordably();
//        System.out.println(card);
//        
//        card.addMoney(10);
//        System.out.println(card);
//        
//        card.addMoney(-15);
//        System.out.println("Paul: "+card);

//Excercise part6:

        PaymentCard PaulsCard = new PaymentCard(20);
        PaymentCard MattsCard = new PaymentCard(30);
        
        PaulsCard.eatHeartily();
        MattsCard.eatAffordably();
        System.out.println("Paul: " + PaulsCard);
        System.out.println("Matt: " + MattsCard);
        
        PaulsCard.addMoney(20);
        MattsCard.eatHeartily();
        System.out.println("Paul: " + PaulsCard);
        System.out.println("Matt: " + MattsCard);

        PaulsCard.eatAffordably();
        PaulsCard.eatAffordably();
        
        MattsCard.addMoney(50);
        System.out.println("Paul: " + PaulsCard);
        System.out.println("Matt: " + MattsCard);           
    }
}
