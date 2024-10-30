package rmerezha.shape;

import javafx.scene.canvas.GraphicsContext;
import rmerezha.util.Point;

public abstract class Shape {

    protected Point p1,p2;

    protected volatile Boolean isFilled = false;

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP1() {
        return p1;
    }

    public abstract void show(GraphicsContext gc);

    public abstract String getName();

    public abstract Shape clone();


    public void withFill(boolean b) {
        this.isFilled = b;
    }

}
