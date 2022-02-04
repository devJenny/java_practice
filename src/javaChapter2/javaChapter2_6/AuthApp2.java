package javaChapter2.javaChapter2_6;

import java.util.Scanner;

public class AuthApp2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your id: ");
        String id = "egoing";
        String inputId = sc.next();

        System.out.print("Input your password: ");
        String pass = "1111";
        String pass2 = "2222";
        String inputPass = sc.next();

        System.out.println("Hi");

        boolean isRightPass = (inputPass.equals(pass) || inputPass.equals(pass2));
        if (inputId.equals(id) && isRightPass) {
                System.out.println("Master!");
            } else {
            System.out.println("Who are you?");
        }
    }
}
