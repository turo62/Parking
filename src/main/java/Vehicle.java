public class Vehicle {
    private String numberPlate;
    private String typeOfVehicle;
    private int yearOfManuf;
    private TIme startingTime;
    private int parkingCost;

    public Vehicle(String numberPlate, String typeOfVehicle, int yearOfManuf, TIme startingTime, int parkingCost){
        this.numberPlate = numberPlate;
        this.typeOfVehicle = typeOfVehicle;
        this.yearOfManuf = yearOfManuf;
        this.startingTime = startingTime;
        this.parkingCost = parkingCost;
    }
}
