package creationalPatterns.builder.director;

import creationalPatterns.builder.builderInterface.HouseBuilder;

// This object not is necessary for the design pattern...
public class Director {

    public void constructSimpleHouse(HouseBuilder houseBuilder){
        houseBuilder.reset();
        houseBuilder.buildWall();
        houseBuilder.buildDoor();
        houseBuilder.buildWindow();
        houseBuilder.buildRoof();
    }

    public void constructExpensiveHouse(HouseBuilder houseBuilder){
        houseBuilder.reset();
        houseBuilder.buildWall();
        houseBuilder.buildDoor();
        houseBuilder.buildWindow();
        houseBuilder.buildRoof();
        houseBuilder.buildPool();
        houseBuilder.buildGarden();
        houseBuilder.buildGarage();
    }
}
