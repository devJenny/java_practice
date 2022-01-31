package java14;

import java.util.Scanner;

class Accounting {
    public  double valueOfSupply;
    public  double vatRate;
    public  double expenseRate;

    double vat = getVAT();
    double total = getTotal();
    double expense = getExpense();
    double income = getIncome();
    double dividend1 = getDividend1();
    double dividend2 = getDividend2();
    double dividend3 = getDividend3();

    public void print() {
        System.out.println("Value of supply : " + valueOfSupply); //공급가
        System.out.println("VAT : " + getVAT()); //부가세
        System.out.println("Total : " + getTotal()); //판매가
        System.out.println("Expense : " + getExpense()); //비용
        System.out.println("Income : " + getIncome()); //수익
        System.out.println("Dividend 1 : " + getDividend1()); //배당1
        System.out.println("Dividend 2 : " + getDividend2()); //배당2
        System.out.println("Dividend 3 : " + getDividend3()); //배당3
    }

    public double getDividend3() {
        return getIncome() * 0.2;
    }

    public double getDividend2() {
        return getIncome() * 0.3;
    }

    public double getDividend1() {
        return getIncome() * 0.5;
    }

    public double getIncome() {
        return valueOfSupply - getExpense();
    }

    public double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public double getTotal() {
        return valueOfSupply + getVAT();
    }

    public double getVAT() {
        return valueOfSupply * vatRate;
    }

}

public class AccountingClassApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Accounting.valueOfSupply = sc.nextDouble();
//        Accounting.vatRate = 0.1;
//        Accounting.expenseRate = 0.3;
//        Accounting.print();

        // instance
        Accounting a1 = new Accounting();
        System.out.print("How much a1? : ");
        a1.valueOfSupply = sc.nextDouble();
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();

        Accounting a2 = new Accounting();
        System.out.print("How much a2? : ");
        a2.valueOfSupply = sc.nextDouble();
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();

    }
}