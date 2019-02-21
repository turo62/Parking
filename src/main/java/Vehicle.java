public class Vehicle {
    private String numberPlate;
    private String typeOfVehicle;
    private int yearOfManuf;
    protected Rates rate;
    private int money;
    private int travelCard;

    public Vehicle(String numberPlate, String typeOfVehicle, int yearOfManuf, int money, int travelCard){
        this.numberPlate = numberPlate;
        this.typeOfVehicle = typeOfVehicle;
        this.yearOfManuf = yearOfManuf;
        this.rate = rate;
        this.money = money;
        this.travelCard = travelCard;
    }
    
    
    public void setMoney(int money) {
        this.money += money;
    }
    
    public void setTravelCard(int hours) {
        if (ParkPlace.getMinimumTravelCardHours() >= hours) {
            if (money >= hours * rate.getValue()) {
                money -= hours * rate.getValue();
            }
        }
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
}
