package ModelElements;

public class Scene {
    private static int count = 0;
    private int id;
    private PoligonalModel Models;
    private Flash flashes;
    private Camera cameras;

    public Scene(PoligonalModel models, Flash flashes, Camera cameras) {
        this.id = ++count;
        this.Models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public <T> T method1(T type) {
        return type;
    }

    public <T> T method2(T type, T type2) {
        return type;
    }
}

