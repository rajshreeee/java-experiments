package composition;

import java.awt.Dimension;

public class Floor {
    private String texture;
    private Dimension dimension;

    public Floor(String texture, Dimension dimension) {
        this.texture = texture;
        this.dimension = dimension;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
