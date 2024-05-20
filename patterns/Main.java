import creationalPatterns.abstractFactory.AbstractFactoryApplication;
import creationalPatterns.abstractFactory.factoryInterface.impl.FirePokemonFactory;
import creationalPatterns.abstractFactory.factoryInterface.impl.WaterPokemonFactory;
import creationalPatterns.builder.director.Director;
import creationalPatterns.builder.model.House;
import creationalPatterns.builder.builderInterface.impl.HouseBuilderImpl;
import creationalPatterns.factoryMethod.subclass.RoadLogistics;
import creationalPatterns.factoryMethod.subclass.SeaLogistics;
import creationalPatterns.factoryMethod.superclass.Logistic;

public class Main {
    public static void main(String[] args) {

        //Factory Method
        System.out.println("---------- FACTORY METHOD ---------");
        Logistic logisticTruck = new RoadLogistics();
        Logistic logisticShip = new SeaLogistics();
        logisticTruck.planDelivery();
        logisticShip.planDelivery();
        System.out.println("----------------------------------- \n");

        //Abstract Factory
        System.out.println("---------- ABSTRACT FACTORY ---------");
        AbstractFactoryApplication abstractFactoryApplicationFire = new AbstractFactoryApplication(new FirePokemonFactory());
        AbstractFactoryApplication abstractFactoryApplicationWater = new AbstractFactoryApplication(new WaterPokemonFactory());
        abstractFactoryApplicationFire.getEeeve().evolve();
        abstractFactoryApplicationWater.getEeeve().evolve();
        abstractFactoryApplicationFire.getBulbasaur().evolve();
        abstractFactoryApplicationWater.getBulbasaur().evolve();
        System.out.println("----------------------------------- \n");

        //Builder
        System.out.println("---------- BUILDER ---------");
        Director director = new Director();
        HouseBuilderImpl simpleHouseBuilder = new HouseBuilderImpl();
        director.constructSimpleHouse(simpleHouseBuilder);
        House simpleHouse = simpleHouseBuilder.getResult();

        HouseBuilderImpl expensiveHouseBuilder = new HouseBuilderImpl();
        director.constructExpensiveHouse(expensiveHouseBuilder);
        House expensiveHouse = expensiveHouseBuilder.getResult();

        System.out.println("Simple House ::  " + simpleHouse.toString());
        System.out.println("Expensive House ::  " + expensiveHouse.toString());
        System.out.println("----------------------------------- \n");
    }
}
