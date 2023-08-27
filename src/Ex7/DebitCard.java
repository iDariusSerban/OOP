package Ex7;

public class DebitCard extends Card {

    private int maxTransactionAmount;

    public DebitCard(boolean isActive, int pin, String cardNumber, int cardBalance, int maxTransactionAmount) {
        super(isActive, pin, cardNumber, cardBalance);
        this.maxTransactionAmount = maxTransactionAmount;
    }

    public int getMaxTransactionAmount() {
        return maxTransactionAmount;
    }

    public void changeTransactionLimit(int maxTransactionAmount) {
        this.maxTransactionAmount = maxTransactionAmount;
    }


    @Override
    public void pay(int amount) throws Exception{
        if (amount > maxTransactionAmount){
            throw new Exception ("you cannot pay more than "+maxTransactionAmount);

        }
        setCardBalance(getCardBalance() - amount);
    }
}
