public class Main {
    
    public static void main(String[] args) {
        ParkPlace p = new ParkPlace();
        Truck bömbi = new Truck("HMS143", "BMW", 2015, 27500);
        
        try {
            p.buyTravelCard(bömbi,13);
        } catch (MinimumHoursException MHE){
            System.out.println(MHE);
        } catch (NoMoneyException NME) {
            System.out.println(NME);
        }
        
    }
}
