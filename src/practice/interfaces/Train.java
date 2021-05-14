package practice.interfaces;

public class Train implements IPublicTransport, IVehicle{
    @Override
    public void getNumberOfPeople() {
        System.out.println(" train has lot of people");
    }

    @Override
    public void drive() {
        System.out.println("the train is moving");
    }

    @Override
    public void turnLeft() {
        System.out.println("train is turning left");
    }

    @Override
    public void brake() {
        System.out.println("The train is in brake mode");
    }
}
