package javaChapter2.javaChapter2_8;

import java.util.Scanner;

public class AuthAppTry3 {
    public static void main(String[] args) {
        String[][] users = {
                {"egoing", "1111"},
                {"jinhuck", "2222"},
                {"youbin", "3333"}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your ID: ");
        String inputId = sc.nextLine();
        System.out.print("Input your Password: ");
        String inputPass = sc.nextLine();

        boolean isLoginged = false;
        for (int i = 0; i < users.length; i++) {
            String[] current = users[i];
            if (current[0].equals(inputId) && current[1].equals(inputPass)) {
                isLoginged = true;
                break;
            }
        }

        if (isLoginged) {
            System.out.println("Welcome. " + inputId + ".");
        } else {
            System.out.println("Sorry.");
        }
        }

    }

