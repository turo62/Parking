public class Bus extends Vehicle {
    protected Rates rate;

    public Bus(String numberPlate, String typeOfVehicle, int yearOfManuf, int money, int travelCard, Rates BUS) {
        super(numberPlate, typeOfVehicle, yearOfManuf, money, travelCard);
        this.rate = BUS;
    }
}
