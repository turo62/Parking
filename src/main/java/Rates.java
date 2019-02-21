public enum Rates {
    
    TRUCK(2000),
    BUS(1000),
    CAR(500);
    
    private int value;
    
    Rates(int value){
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}
