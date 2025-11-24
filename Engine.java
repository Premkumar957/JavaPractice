//Interface
interface Engine {
    public abstract void start();
}


interface Tyre {
    public abstract void run();
}


class Bike implements Engine, Tyre {
    public void start() {
        System.out.println("Bike Engine is started!");
    }

    public void run() {
        System.out.println("Bike Tye is rolling");
    }

    void stop() {
        System.out.println("Bike Engine is stopped!...");
        System.out.println("Bike Tyre is rolled");
    }
}