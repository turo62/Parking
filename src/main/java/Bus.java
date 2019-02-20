public class Bus extends Vehicle {
    private int parkingRate;

    public Bus(String numberPlate, String typeOfVehicle, int yearOfManuf, TIme startingTime, int parkingCost) {
        super(numberPlate, typeOfVehicle, yearOfManuf, startingTime, parkingCost);
    }

    public final int getParkingRate() {
        return parkingRate = 1000;
    }
}
