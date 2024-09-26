package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int sceneId;
    ArrayList<PolygonalModel> models = new ArrayList<>();
    ArrayList<Flash> flashes = new ArrayList<>();

    public Scene(int i, List<PolygonalModel> models, List<Flash> flashes, List<Camera> cameras) {
    }

}
