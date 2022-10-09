package _2;

public class Circle {

    private double r = 0.0;
    private final Point p;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public String toString() {
        return "Circle{" + "x" + p.x + "y" + p.y + "r" + r + "}";
    }
}

/*package _4;

        import java.util.ArrayList;

class Shop{}

public class TestsHOP {
    public static void main(String[] args){}


    ArrayList<String> Comp = new ArrayList<String>();
        Comp.add("uhyvguyj");
        Comp.add("yubghbk");
        Comp.add("yuggikuh");
        Comp.add("yhoiu");
        Comp.add("iojliui");
    public void Rem(String c){
        Comp.remove(c)
    }
        if (Comp.contains("c")) {
        System.out.println("In stock");
    }
}


package _4;

        import java.util.Scanner;

public class TesterShop {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Shop mg = new Shop();
        String name = in.nextLine();
        mg.add("jka");
        mg.add("jya");
        mg.add("jkat");
        mg.add("jkui");
        mg.add("jha");
        System.out.println(mg.find(name));
        mg.getList();
        mg.add(name);

    }
}



package _4;
        import javax.swing.*;
        import java.util.Scanner;
        import java.util.ArrayList;
public class Shop {
    private String name;
    private ArrayList<String> list;
    public Shop(String name){
        this.name = name;
        list = new ArrayList<>();

    }
    public Shop(){
        list = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void delete(String name) {
        list.remove(name);
    }
    public boolean find(String name) {
        if (list.contains(name)){
            return true;}
        else{
            return false;
        }
    }
    public void add(String name){list.add(name);}

    public ArrayList<String> getList() {
        return list;
    }
}

public class Circle {
}
*/