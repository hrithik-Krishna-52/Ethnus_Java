class Vehicle {
    public void Moves() {
        System.out.println("Moving");
    }
}

class Car extends Vehicle {
    public void Drive() {
        System.out.println("Drives!");
    }
}

class Bike extends Vehicle {
    public void Ride() {
        System.out.println("Rides!");
    }
}

public class HI_Example{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();
        car.Moves();
        car.Drive();
        bike.Moves();
        bike.Ride();
    }
}