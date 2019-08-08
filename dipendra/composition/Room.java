package composition;

public class Room {
    private String name;
    private Door door;
    private Window window;
    private Floor floor;
    private Ceiling ceiling;
    private Wall wall;
    private Furniture furniture;

    public Room(String name, Door door, Window window, Floor floor, Ceiling ceiling, Wall wall, Furniture furniture) {
        this.name = name;
        this.door = door;
        this.window = window;
        this.floor = floor;
        this.ceiling = ceiling;
        this.wall = wall;
        this.furniture = furniture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }
}
