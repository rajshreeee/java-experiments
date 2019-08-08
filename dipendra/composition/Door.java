package composition;

import java.awt.Dimension;

public class Door {
    private String direction;
    private Dimension dimension;

    public Door(String direction, Dimension dimension) {
        this.direction = direction;
        this.dimension = dimension;
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
