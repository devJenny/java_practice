package JavaChapter1.java14;

import java.util.Scanner;

public class AccountingMethodApp {

    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How much? : ");
        valueOfSupply = sc.nextDouble();
        vatRate = 0.1;

        double vat = getVAT();
        double total = getTotal();
        expenseRate = 0.3;
        double expense = getExpense();
        double income = getIncome();
        double dividend1 = getDividend1();
        double dividend2 = getDividend2();
        double dividend3 = getDividend3();

        print();

    }

    public static void print() {
        System.out.println("Value of supply : " + valueOfSupply); //공급가
        System.out.println("VAT : " + getVAT()); //부가세
        System.out.println("Total : " + getTotal()); //판매가
        System.out.println("Expense : " + getExpense()); //비용
        System.out.println("Income : " + getIncome()); //수익
        System.out.println("Dividend 1 : " + getDividend1()); //배당1
        System.out.println("Dividend 2 : " + getDividend2()); //배당2
        System.out.println("Dividend 3 : " + getDividend3()); //배당3
    }

    public static double getDividend3() {
        return getIncome() * 0.2;
    }

    public static double getDividend2() {
        return getIncome() * 0.3;
    }

    public static double getDividend1() {
        return getIncome() * 0.5;
    }

    public static double getIncome() {
        return valueOfSupply - getExpense();
    }

    public static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public static double getTotal() {
        return valueOfSupply + getVAT();
    }

    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
}
