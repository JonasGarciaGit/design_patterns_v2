package creationalPatterns.builder.builderInterface.impl;

import creationalPatterns.builder.model.House;
import creationalPatterns.builder.builderInterface.HouseBuilder;

public class HouseBuilderImpl implements HouseBuilder {

    private House house;

    public HouseBuilderImpl(){}

    @Override
    public void buildWall() {
        house.setWall(true);
    }

    @Override
    public void buildDoor() {
        house.setDoor(true);
    }

    @Override
    public void buildWindow() {
        house.setWindow(true);
    }

    @Override
    public void buildRoof() {
        house.setRoof(true);
    }

    @Override
    public void buildGarage() {
        house.setGarage(true);
    }

    @Override
    public void buildPool() {
        house.setPool(true);
    }

    @Override
    public void buildGarden() {
        house.setGarden(true);
    }

    @Override
    public House getResult() {
        return this.house;
    }

    @Override
    public void reset() {
        this.house = new House();
    }
}
