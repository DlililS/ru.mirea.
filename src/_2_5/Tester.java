package _2_5;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Double n = in.nextDouble();
        Integer id = in.nextInt();
        Dog humanage = new Dog(name, n);
        PitomnicDog pitomnic = new PitomnicDog(id, name);

      /*  System.out.println(pitomnic.find(id, name));
        System.out.println(humanage.humandogage(n));
        //pitomnic.getList();
        pitomnic.put(n, name);
        System.out.println("Enter 'add', 'delete', 'output', 'search' or 'end':");
        String i = in.next();
        Integer k = Integer.valueOf(in.next());
        while(i.length() != 0) {
            if (i.equals("add")) {
                System.out.println("Do you want to add a dog?");
                System.out.println("Enter id and name: ");
                //PitomnicDog c1 = new Dog(in.next(), in.next());
                pitomnic.put(k, i);
                System.out.println("Enter a request:");
                i = in.next();
            }
            if (i.equals("delete")) {
                System.out.println("Enter the model of the computer you want to delete");
                pitomnic.delete(k);
                System.out.println("Enter a request:");
                i = in.next();
            }
            if (i.equals("search")) {
                System.out.println("Find a computer");
                System.out.println(pitomnic.find(k, i));
                System.out.println("Enter a request:");
                i = in.next();
            }
            if (i.equals("humanage")) {
                System.out.println(humanage.humandogage(n));
            }
            if(i.equals("end")){
                i = "";
            }
        }

       */
    }
}
