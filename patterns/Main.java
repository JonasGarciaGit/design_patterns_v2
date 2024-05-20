import creationalPatterns.abstractFactory.AbstractFactoryApplication;
import creationalPatterns.abstractFactory.FirePokemonFactory;
import creationalPatterns.abstractFactory.WaterPokemonFactory;
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

        //Abstract Factory
        AbstractFactoryApplication abstractFactoryApplicationFire = new AbstractFactoryApplication(new FirePokemonFactory());
        AbstractFactoryApplication abstractFactoryApplicationWater = new AbstractFactoryApplication(new WaterPokemonFactory());
        abstractFactoryApplicationFire.getEeeve().evolve();
        abstractFactoryApplicationWater.getEeeve().evolve();
        abstractFactoryApplicationFire.getBulbasaur().evolve();
        abstractFactoryApplicationWater.getBulbasaur().evolve();
    }
}
