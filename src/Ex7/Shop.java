package Ex7;

public class Shop {
    public static void main(String[] args) {
        Card creditCard = new CreditCard(true, 1234, "nr1",500, 500);
        Card debitCard = new DebitCard(true, 1234, "nr2",1000, 500);
        Address address1 = new Address("str1",1,"city1");
        Address address2 = new Address("str2",2,"city2");

        ShoppingAccount shoppingAccount = new ShoppingAccount("Costel");
        shoppingAccount.addAddress(address1);
        shoppingAccount.addAddress(address2);
        shoppingAccount.addPaymentMethod(creditCard);
        shoppingAccount.addPaymentMethod(debitCard);
        shoppingAccount.selectPaymentMethod("nr1");
        shoppingAccount.setCurrentAddress(address1);



        try {
            shoppingAccount.getCurrentPaymentMethod().pay(50);
            shoppingAccount.generateInvoice(50);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
