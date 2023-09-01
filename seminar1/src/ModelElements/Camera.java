package ModelElements;


public class Camera {
    Point3D location;
    Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }
    void rotate(Angle3D angle){    }
    void move(Point3D point){}
}