package composition;

import java.awt.*;

public class Main {
    public static void main(String args[]) {
        Door door = new Door("North", new Dimension(50, 100));

        Window window = new Window(2, "West", new Dimension(50, 50));

        Floor floor = new Floor("Marble", new Dimension(1000, 1000));
        Ceiling ceiling = new Ceiling("White", new Dimension(1000, 1000));

        Wall wall = new Wall("Maroon", 4, new Dimension(300, 300));

        Furniture couch = new Furniture("Couch", "Lavish", new Dimension(50, 50));

        Room room = new Room("Living", door, window, floor, ceiling, wall, couch);

        System.out.println(
                "\nName: " + room.getName()
                + "\nWall Count: " + room.getWall().getCount()
                + "\nFurniture: " + room.getFurniture().getName()
                + "\nDoor Direction: " + room.getDoor().getDirection()
                + "\nFloor Texture: " + room.getFloor().getTexture()
                + "\nCeiling Color: " + room.getCeiling().getColor()
        );
    }
}
