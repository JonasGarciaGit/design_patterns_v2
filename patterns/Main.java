import creationalPatterns.factoryMethod.subclass.RoadLogistics;
import creationalPatterns.factoryMethod.subclass.SeaLogistics;
import creationalPatterns.factoryMethod.superclass.Logistic;

public class Main {
    public static void main(String[] args) {

        //Factory Method
        Logistic logisticTruck = new RoadLogistics();
        Logistic logisticShip = new SeaLogistics();
        logisticTruck.planDelivery();
        logisticShip.planDelivery();


    }
}
