public class Vehicle {
    private String numberPlate;
    private String typeOfVehicle;
    private int yearOfManuf;
    private int money;
    
    public Vehicle(String numberPlate, String typeOfVehicle, int yearOfManuf, int money){
        this.numberPlate = numberPlate;
        this.typeOfVehicle = typeOfVehicle;
        this.yearOfManuf = yearOfManuf;
        this.money = money;
    }
    
    
    public void setMoney(int money) {
        this.money -= money;
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
}
