package practice.interfaces;

public class Test1 {
    public static void main(String[] args) {
        MotorisedVehicle motorisedVehicle= new MotorisedVehicle();
        motorisedVehicle.checkMotor();
        IVehicle  car= new Car();
        car.brake();
        car.drive();
        IVehicle train= new Train();
        train.brake();
        train.drive();
        IPublicTransport publicTransportTrain= new Train();
        publicTransportTrain.getNumberOfPeople();
    }
}
