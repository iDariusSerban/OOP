package Ex7;

public abstract class Card {

    private boolean isActive;
    private int pin;
    private String cardNumber;
    private int cardBalance;

    public Card(boolean isActive, int pin, String cardNumber, int cardBalance) {
        this.isActive = isActive;
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getPin() {
        return pin;
    }

    public void changePin(int pin) throws Exception{
        if (String.valueOf(pin).length()!=4) {
            throw new Exception("pin must be 4 digits");
        }
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public void freezeCard (){
        isActive = false;
    }

    public abstract void pay (int amount) throws Exception;

}
