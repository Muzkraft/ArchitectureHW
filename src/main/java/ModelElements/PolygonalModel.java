package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {

    public List<Texture> Textures;
    public List<Polygon> Polygons;

    public PolygonalModel(List<Texture> Textures) {
        this.Polygons = new ArrayList<>();
        this.Textures = Textures;
    }

}

