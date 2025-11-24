//Abstraction
abstract class Whatsapp {
    public void sendMessage(String sMsg) {
        System.out.println("Sending " + sMsg);
    }

    public abstract void platformAPICall(); 
}



class WhatsappAndriod extends Whatsapp {

    public void platformAPICall() {
        System.out.println("Calling Andriod-specific API...");
    }
}


class WhatsappIos extends Whatsapp {

    public void platformAPICall() {
        System.out.println("Calling Ios-specific API...");
    }
}



class WhatsappWindows extends Whatsapp {

    public void platformAPICall() {
        System.out.println("Calling Windows-specific API...");
    }
}

