package _1;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        int n = sc.nextInt();
        array = new int[n];
        int a = 0;
        for(int i = 0; i < n; i++){
                a+=array[i];
            }
        System.out.println(a);
        System.out.println(a/n);
    }
}
