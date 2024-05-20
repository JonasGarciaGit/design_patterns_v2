package creationalPatterns.builder.builderInterface;

import creationalPatterns.builder.model.House;

public interface HouseBuilder {
    public void buildWall();
    public void buildDoor();
    public void buildWindow();
    public void buildRoof();
    public void buildGarage();
    public void buildPool();
    public void buildGarden();
    public House getResult();
    public void reset();
}
