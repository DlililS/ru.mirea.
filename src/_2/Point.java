package _2;


public class Point {
    protected double x = 0.0;
    protected double y = 0.0;
    public Point(){}
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void move(double a, double b) {
        this.x +=a;
        this.y +=b;
    }
    public String toString() {
        return "Point{" + "x" + x + "y" + y + "}";
    }
}
