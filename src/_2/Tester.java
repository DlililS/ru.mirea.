package _2;

public class Tester {
    public static void main(String[] args) {
        Circle[] c = new Circle[5];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Circle(new Point(4, 6), 5);
            System.out.println(c[i]);
        }
    }
}