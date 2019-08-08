package composition;

import java.awt.*;

public class Wall {
    private String color;
    private int count;
    private Dimension dimension;

    public Wall(String color, int count, Dimension dimension) {
        this.color = color;
        this.count = count;
        this.dimension = dimension;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
