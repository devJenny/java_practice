package java14;

import java.util.Scanner;

public class AccountingArrayLoopApp {
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

        System.out.println("Value of supply : " + valueOfSupply); //공급가
        System.out.println("VAT : " + vat); //부가세
        System.out.println("Total : " + total); //판매가
        System.out.println("Expense : " + expense); //비용
        System.out.println("Income : " + income); //수익

        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        int i = 0;
        while(i < dividendRates.length) {
            System.out.println("Dividend : " + (income * dividendRates[i])); //배당1
            i = i+1;
        }

    }
}
