package _1;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        int a=0;
        for(int i=0; i < n; i++){
            b[i] = sc.nextInt();
            a+=b[i];
        }
        double sr = 0.1*a/n*10;
        System.out.print(a+"  "+sr);
    }
}
