public class ParkPlace {
    protected double penaltyRate = 0.5;
    private static int minimumTravelCardHours = 10;
    private final int CAR = 500;
    private final int BUS = 1000;
    private final int TRUCK = 2000;
    
    public ParkPlace() {
        this.penaltyRate = penaltyRate;
    }
    
    public int getCAR(int CAR) {
        return CAR;
    }
    
    public double getPenaltyRate() {
        return penaltyRate;
    }
    
    public static int getMinimumTravelCardHours() {
        return minimumTravelCardHours;
    }
    
    public void buyTravelCard(Vehicle v, int hours) throws MinimumHoursException, NoMoneyException {
        if (getMinimumTravelCardHours() <= hours) {
            int cost = hours * v.travelCardValue(v);
            if (v.getMoney() >= cost) {
                v.setMoney(cost);
                v.setTravelCard(hours);
                System.out.println(v.getTravelCard());
                System.out.println("The available money is " + v.getMoney());
            } else {
                throw new  NoMoneyException("Not enough money!");
            }
        } else {
            throw new MinimumHoursException("Minimum hours ot buy is " + getMinimumTravelCardHours() + ". You are trying to buy " + hours);
        }
    }
    
}
