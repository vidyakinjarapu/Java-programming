
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        
        /*
        PaymentCard petesCard = new PaymentCard(10);
        
        System.out.println("Pete's card balance: " + petesCard.balance());
        boolean wasSuccess = petesCard.takeMoney(6);
        System.out.println("Pete's card balance: " + petesCard.balance());
        
        wasSuccess = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccess);
        System.out.println("money " + petesCard.balance());
        
        petesCard.addMoney(20);
        System.out.println("Balnce after adding money: " + petesCard.balance());
        
        System.out.println("---------------------------------------------");
        
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(unicafeExactum);
*/
        
        PaymentTerminal uniCafe = new PaymentTerminal();
        System.out.println(uniCafe);
        
        PaymentCard annesCard = new PaymentCard(2);
        System.out.println("Annes card balance: " + annesCard.balance());
        
        boolean WasSuccess = uniCafe.eatHeartily(annesCard);
        System.out.println("there was enough money: " + WasSuccess);
        
        WasSuccess = uniCafe.eatAffordably(annesCard);
        System.out.println("there was enough money: " + WasSuccess);
        
        uniCafe.addMoneyToCard(annesCard, 100);
        WasSuccess = uniCafe.eatHeartily(annesCard);
        System.out.println("there was enough money: " + WasSuccess);
        
        System.out.println("Annes card balance: " + annesCard.balance());
        System.out.println(uniCafe);
        
    }
}

