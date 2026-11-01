package Week2_Calculator;

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }
}
