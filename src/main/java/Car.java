public class Car extends Vehicle {
    protected Rates rate;

        public Car(String numberPlate, String typeOfVehicle, int yearOfManuf,  int money, int travelCard, Rates CAR) {
            super(numberPlate, typeOfVehicle, yearOfManuf, money, travelCard);
            this.rate = CAR;
    }
}