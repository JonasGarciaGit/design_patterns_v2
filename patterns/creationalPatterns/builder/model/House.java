package creationalPatterns.builder.model;

public class House {

    private boolean wall;
    private boolean door;
    private boolean window;
    private boolean roof;
    private boolean garage;
    private boolean pool;
    private boolean garden;

    public House(){}

    public boolean isWall() {
        return wall;
    }

    public boolean isDoor() {
        return door;
    }

    public boolean isWindow() {
        return window;
    }

    public boolean isRoof() {
        return roof;
    }

    public boolean isGarage() {
        return garage;
    }

    public boolean isPool() {
        return pool;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }

    public void setDoor(boolean door) {
        this.door = door;
    }

    public void setWindow(boolean window) {
        this.window = window;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "House{" +
                "wall=" + wall +
                ", door=" + door +
                ", window=" + window +
                ", roof=" + roof +
                ", garage=" + garage +
                ", pool=" + pool +
                ", garden=" + garden +
                '}';
    }
}
