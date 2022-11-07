package _2_8;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args){
        Scanner source = new Scanner(System.in);
        String s = source.next();
        char[] a = s.toCharArray();
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        int n = a.length;
        char temp;
        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}
