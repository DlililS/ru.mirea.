package _1;
public class _6 {
    public static void main(String[] args) {
        String array[];
        array = new String[10];

        double scale = Math.pow(10, 3);
        for(int i = 0; i < 10; i++){
            double u = i;
            array[i] =  String.format("%.2f", (1 / (u + 1)));
            System.out.println( array[i]);
        }

    }
}
