
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    
    public Money plus(Money addition){
        int cents = this.cents + addition.cents();
        int euros = this.euros + addition.euros();    
        
        Money newMoney = new Money(euros, cents); 
        return newMoney;        
    }
    
    public boolean lessThan(Money compared){
        if(this.euros > compared.euros()){
            return false;
        } else if(this.euros == compared.euros() && this.cents > compared.cents()){
            return false;
        } else {      
            return true;
        }
    }
    
    public Money minus(Money decreaser){
        int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();
        if(euros < 0){
            cents = 0;
            euros = 0;
        }       
        if(cents < 0) {
            cents = 100 + cents;
            euros = euros - 1;
        }        
        Money newMoney = new Money(euros, cents); 
        return newMoney;       
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }
        return this.euros + "." + zero + this.cents + "e";
    }

}
