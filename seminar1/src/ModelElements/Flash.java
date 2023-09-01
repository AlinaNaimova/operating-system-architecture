package ModelElements;


import java.awt.*;

public class Flash {
    Point3D location;
    Angle3D angle;
    Color color;
    Float power;


    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    void rotate(Angle3D angle){    }
    void move(Point3D point){}
}


