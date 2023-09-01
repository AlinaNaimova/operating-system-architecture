package ModelElements;

public class PoligonalModel {
    Poligon poligon;
    Texture texture;
    public PoligonalModel(Poligon poligon, Texture texture) {
        this.poligon = poligon;
        this.texture = texture;
    }


    @Override
    public String toString() {
        return "PoligonalModel{" +
                "poligon=" + poligon +
                ", texture=" + texture +
                '}';
    }
}
