package _2_1;

import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        Author c = new Author( "CChg", "456rtfytf576.jhb", 'f');
        System.out.println("name:" + c.getName() + " email" + c.getEmail() + "gender" + c.getGender());
    }
}
