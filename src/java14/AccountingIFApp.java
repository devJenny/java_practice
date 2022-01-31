package java14;

import java.util.Scanner;

public class AccountingIFApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How much? : ");
        double valueOfSupply = sc.nextDouble();

        double vatRate = 0.1;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expenseRate = 0.3;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        double dividend1;
        double dividend2;
        double dividend3;

        if (income > 10000.0) {
            dividend3 = income * 0.2;
            dividend1 = income * 0.5;
            dividend2 = income * 0.3;
        } else {
            dividend1 = income * 1.0;
            dividend2 = income * 0;
            dividend3 = income * 0;
        }

        System.out.println("Value of supply : " + valueOfSupply); //공급가
        System.out.println("VAT : " + vat); //부가세
        System.out.println("Total : " + total); //판매가
        System.out.println("Expense : " + expense); //비용
        System.out.println("Income : " + income); //수익
        System.out.println("Dividend 1 : " + dividend1); //배당1
        System.out.println("Dividend 2 : " + dividend2); //배당2
        System.out.println("Dividend 3 : " + dividend3); //배당3

    }
}
