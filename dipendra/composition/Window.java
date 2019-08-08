package composition;

import java.awt.*;

public class Window {
    private int count;
    private String direction;
    private Dimension dimension;

    public Window(int count, String direction, Dimension dimension) {
        this.count = count;
        this.direction = direction;
        this.dimension = dimension;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
