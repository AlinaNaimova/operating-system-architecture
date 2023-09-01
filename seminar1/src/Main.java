import ModelElements.Angle3D;
import ModelElements.Camera;
import ModelElements.Point3D;

import java.awt.*;


public class Main {
    public static void main(String[] args) {

    }
}
//
//
//package InMemoryModel
//интерфейс IModelChangedObserver
//+applyUpdateModel()
//
//класс ModelStore
//+Models: PoligonalModel
//+Scenes: Scene
//+Flashes: Flash
//+Cameras: Camera
//-changeObservers:IModelChnageObserver
//+GetScena(int): Scene
//+NotifyChange(IModelChnage)
//
//интерфейс ModelChnager
//+NotifyChange(IModelChnage sender)
//
//package ModelElements
//PoligonalModel
//+Poligons: Poligon
//+Textures: Texture
//
//класс Flash
//+Location: Point3D
//+Angle: Angle3D
//+Color: Color
//+Power: Float
//+Rotate(Angle3D): void
//+Move(Point3D): void
//
//Класс Camera
//+Location: Point3D
//+Angle: Angle3D
//+Rotate(Angle3D): void
//+Move(Point3D): void
//
//Класс Scenes
//+Id: int
//+Models: PoligonalModel
//+Flashes: Flash
//+method1(Type): Type
//+method1(Type, Type): Type
//
//Класс Poligon
//+Points: Point3D
//
//
//Класс Texture