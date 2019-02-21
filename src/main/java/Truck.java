public class Truck extends Vehicle {
    protected Rates rate;

    public Truck(String numberPlate, String typeOfVehicle, int yearOfManuf, int money, int travelCard, Rates TRUCK) {
        super(numberPlate, typeOfVehicle, yearOfManuf, money, travelCard);
        this.rate = TRUCK;
    }

}