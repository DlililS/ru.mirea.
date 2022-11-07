package _2_6;

public class Circle {
    private double x;
    private double y;
    private double r;
    public double getX() {return x;}
    public void setX(double x) {this.x = x;}
    public double getY() {return y;}
    public void setY(double y) {this.y = y;}
    public double getR() {return r;}
    public void setR(double r) {this.r = r;}

    public Circle(double x, double y, double r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public String toString() {
        return "Круг {" + " x=" + x +", y=" + y + ", r=" + r + '\'' + '}';
    }
    public double getLength(){
        double c;
        c = 2*Math.PI*r;
        return c;
    }
    public double Square(){
        double c;
        c = Math.PI*r*r;
        return c;
    }
    public String Two_Circle(Circle a){
        String c1 = "";
        String c2 = "";
        String c3 = "";
        if(this.r > a.r){
            c1 = "1 круг > 2 круга";
        }
        if(this.y > a.y){
            c2 = "1 круг выше 2 круга";
        } else if (this.y < a.y) {
            c2 = "1 круг ниже 2 круга";
        }
        else{
            c2 = "круги на одной высоте";
        }
        if(this.x > a.x){
            c3 = "1 круг правее 2 круга";
        } else if (this.x < a.x) {
            c3 = "1 круг левее 2 круга";
        }
        else{
            c3 = "круги на одной широте";
        }
        return c1 + "\n" + c2 + "\n" + c3;
    }
}
