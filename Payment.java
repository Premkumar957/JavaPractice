//Abstraction
abstract class Payment {

    void connectToServer() {
        System.out.println("Connecting to bank..."); 
    }

    abstract void makePayment(int amount);

}


class Upi extends Payment {
    void makePayment(int amount) {
        System.out.println("Generating UPI Token...");
        System.out.println("Connecting to bank server...");
        System.out.println("Encrypting payment details...");
        System.out.println("Payment successful: " + amount);
    }
}


class Card extends Payment {
    void makePayment(int amount) {
        System.out.println("Generating Card Token...");
        System.out.println("Connecting to bank server...");
        System.out.println("Encrypting payment details...");
        System.out.println("Payment successful: " + amount);
    }
}







