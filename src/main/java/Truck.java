public class Truck extends Vehicle {
    private int parkingRate;

    public Truck(String numberPlate, String typeOfVehicle, int yearOfManuf, TIme startingTime, int parkingCost) {
        super(numberPlate, typeOfVehicle, yearOfManuf, startingTime, parkingCost);
    }

    public final int getParkingRate() {
        return parkingRate = 2000;
    }
}