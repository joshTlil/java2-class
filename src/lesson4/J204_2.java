package lesson4;

public class J204_2 {
    public static void main(String[] args) {
    Car car = new Car();
    Bike bike = new Bike();

    car.start();
    car.stop();
    bike.start();
    bike.stop();
    }
}

interface StartnStop{
    void start();
    void stop();
}

class Car implements StartnStop{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }
}

class Bike implements StartnStop{
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stopped");
    }
}