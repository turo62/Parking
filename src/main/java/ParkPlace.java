public class ParkPlace {
    private int hours;
    private int rate;
    protected double penaltyRate = 0.5;
    private static int minimumTravelCardHours = 10;
    private final int CAR = 500;
    private final int BUS = 1000;
    private final int TRUCK = 2000;
    private final int CARROOM = 15;
    private final int BUSROOM = 5;
    private final int TRUCKROOM = 2;
    private int carRoom = 0;
    private int busRoom = 0;
    private int truckRoom = 0;
    private TravelCard[] cardList;
    private
    
    /**
     * This class contains each method related to parking house.
     */
    
    public ParkPlace() {
        this.penaltyRate = penaltyRate;
    }
    
    public int getHours() {
        return hours;
    }
    
    public int getRate() {
        return rate;
    }
    
    /**
     * This is the list of number plates and travel card hours related to the specific number plate.
     */
    
    public TravelCard[] getCardList() {
        return cardList;
    }
    
    public double getPenaltyRate() {
        return penaltyRate;
    }
    
    public static int getMinimumTravelCardHours() {
        return minimumTravelCardHours;
    }
    
    /**
     * The method checks subclass of vehicle and
     * @return hourly parking rate.
     */
    
    public int parkingRate(Vehicle v) {
        if(v instanceof Car) {
            this.rate = CAR;
        } else if (v instanceof Bus) {
            this.rate = BUS;
        } else if (v instanceof Truck) {
            this.rate = TRUCK;
        }
        return rate;
    }
    
    /**
     * The method is invoked from main to buy travel card in parking house.
     * @param v Vehicle needs travel card.
     * @param hours The hours to buy.
     * @throws MinimumHoursException if vehicle wants to buy less hours for travel card then set for parking house.
     * @throws NoMoneyException if vehicle has no money enough to buy required hours.
     */
    
    public void buyTravelCard(Vehicle v, int hours) throws MinimumHoursException, NoMoneyException {
        if (getMinimumTravelCardHours() <= hours) {
            int money1 = v.getMoney();
            int cost = hours * parkingRate(v);
            if (money1 >= cost) {
                v.setMoney(cost);
                /*v.setTravelCard(hours); */
                System.out.println(v.getMoney());
            } else {
                throw new  NoMoneyException("Not enough money!");
            }
        } else {
            throw new MinimumHoursException("Minimum hours ot buy is " + getMinimumTravelCardHours() + ". You are trying to buy " + hours);
        }
    }
    
    /**
     * The method checks whether there is room for the specific vehicle.
     *
     * @param v the vehicle which wants to park in.
     * @return boolean which is true if there is room.
     */
    
    private boolean checkRoom(Vehicle v) {
        boolean b = true;
        
        if(v instanceof Car) {
            if (CARROOM > carRoom) { return b;}
        } else if (v instanceof Bus) {
            if (BUSROOM > busRoom) { return b;}
        } else if (v instanceof Truck) {
            if (TRUCKROOM > truckRoom) { return b;}
        }
        
        return false;
    }
    
    /**
     * The method manages buying ticket for parking.
     *
     * @param v the vehicle which wants to park in.
     * @param hours the hours vehicle wants to stay at parking
     * @return ???
     * @throws NoMoneyException
     */
    private int buyTicket(Vehicle v, int hours) throws NoMoneyException {
        if (v.getMoney() >= hours * parkingRate(v)) {
            v.setMoney(hours * parkingRate(v));
            return this.hours;
        } else{
            throw new NoMoneyException("Not enough money!");
        }
    }
    
    public void parkingIn(Vehicle v, int hours) throws NoMoneyException {
        if (checkRoom(v)) {
            buyTicket(v, hours);
        }
        }
    }
}
