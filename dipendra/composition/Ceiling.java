package composition;

import java.awt.*;

public class Ceiling {
    private String color;
    private Dimension dimension;

    public Ceiling(String color, Dimension dimension) {
        this.color = color;
        this.dimension = dimension;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
