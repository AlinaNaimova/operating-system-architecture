package InMemoryModel;

import ModelElements.*;

public class ModelStore implements IModelChanger{
    static float power = 0;
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangedObserver changeObserver;

    public ModelStore(IModelChangedObserver changeObserver) {
        this.changeObserver = changeObserver;
        this.models = new PoligonalModel(new Poligon(new Point3D()), new Texture());
        this.cameras = new Camera(new Point3D(), new Angle3D());
        this.flashes = new Flash(new Point3D(), new Angle3D(), new Color(),power);
        this.scenes = new Scene(this.models, this.flashes, this.cameras);
    }

    public Scene getScena(int n){
        return this.scenes;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}