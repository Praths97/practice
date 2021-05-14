package practice.interfaces;

public class Car extends  MotorisedVehicle implements IVehicle{


    @Override
    public void drive() {
        System.out.println("the car is moving");
    }

    @Override
    public void turnLeft() {
        System.out.println("car is turning left");
    }

    @Override
    public void brake() {
        System.out.println("The car is in brake mode");
    }
}
