package javaChapter2.javaChapter2_4;

import java.util.Scanner;

public class AuthApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your id: ");
        String id = "egoing";
        String inputId = sc.next();

        System.out.print("Input your password: ");
        String pass = "1111";
        String inputPass = sc.next();

        System.out.println("Hi");

//        if (inputId.equals(id)) {
//            if (inputPass.equals(pass)) {
//                System.out.println("Master!");
//            } else {
//                System.out.println("Wrong password");
//            }
//        } else {
//            System.out.println("Who are you?");
//        }

        if (inputId.equals(id) && inputPass.equals(pass)) {
                System.out.println("Master!");
            } else {
            System.out.println("Who are you?");
        }
    }
}
