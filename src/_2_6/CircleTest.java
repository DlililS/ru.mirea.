package _2_6;
import java.lang.*;
import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        double r;
        Circle k1 = new Circle(3.1, 4.1, 5.1);
        System.out.println("Длина окружности = " + k1.getLength() + "см\n");
        System.out.println("Площадь круга = " + k1.Square() + "см^2");
        System.out.println("Введите радиус ");
        Scanner source = new Scanner(System.in);
        r = source.nextDouble();
        k1.setR(r);
        Circle k2 = new Circle(2, 10, r);
        System.out.println("Длина окружности = " + k2.getLength() + "см");
        System.out.println("Площадь круга = " + k2.Square() + "см^2");
        System.out.println(k1.Two_Circle(k2));
    }
}
