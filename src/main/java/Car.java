public class Car extends Vehicle {
    private int parkingRate;

    public Car(String numberPlate, String typeOfVehicle, int yearOfManuf, TIme startingTime, int parkingCost) {
        super(numberPlate, typeOfVehicle, yearOfManuf, startingTime, parkingCost);
    }

    public final int getParkingRate() {
        return parkingRate = 500;
    }
}