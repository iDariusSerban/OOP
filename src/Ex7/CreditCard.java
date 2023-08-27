package Ex7;

public class CreditCard extends Card {

    private final int maxOverDraft;

    public CreditCard(boolean isActive, int pin, String cardNumber, int cardBalance, int maxOverDraft) {
        super(isActive, pin, cardNumber, cardBalance);
        this.maxOverDraft = maxOverDraft;
    }


    @Override
    public void pay(int amount) throws Exception {
        if (amount > getCardBalance() + maxOverDraft){
            throw new Exception("you cannot pay more than");
        }
        setCardBalance(getCardBalance()-amount);
    }
}
