public class Vehicle {
    private String numberPlate;
    private String typeOfVehicle;
    private int yearOfManuf;
    private int money;
    private int travelCard = 0;
    private int hours;
    private int value;
    
    public Vehicle(String numberPlate, String typeOfVehicle, int yearOfManuf, int money, int travelCard){
        this.numberPlate = numberPlate;
        this.typeOfVehicle = typeOfVehicle;
        this.yearOfManuf = yearOfManuf;
        this.money = money;
        this.travelCard = travelCard;
    }
    
    
    public void setMoney(int money) {
        this.money -= money;
    }
    
    public void setTravelCard(int hours) {
        this.travelCard += hours;
    }
    
    public String getNumberPlate() {
        return numberPlate;
    }
    
    public String getTypeOfVehicle() {
        return numberPlate;
    }
    
    public int getYearOfManuf() {
        return yearOfManuf;
    }
    
    public int getMoney() {
        return money;
    }
    
    public int getTravelCard() {
        return travelCard;
    }
    
    public int getHours() {
        return hours;
    }
    
    public int getValue() {
        return value;
    }
    
    public int travelCardValue(Vehicle v) {
        if(v instanceof Car) {
            this.value = 500;
        } else if (v instanceof Bus) {
            this.value = 1000;
        } else if (v instanceof Truck) {
            this.value = 2000;
        }
        return value;
    }
}
