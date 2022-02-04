package javaChapter2_10;

class Accounting {
    public double valueOfSupply;
    public static double vatRate = 0.1;

    public Accounting(double valueOfSupply) {
        this.valueOfSupply = valueOfSupply;
    }

    public double getVat() {
        return valueOfSupply * vatRate;
    }

    public double getTotal() {
        return valueOfSupply + getVat();
    }
}

public class AccountingApp {
    public static void main(String[] args) {

        System.out.println("==== 10,000원 ====");
        Accounting v1 = new Accounting(10000.0);
        System.out.println("Value of supply : " + v1.valueOfSupply);
        System.out.println("VAT : " + v1.getVat());
        System.out.println("Total : " + v1.getTotal());

        System.out.println("==== 20,000원 ====");
        Accounting v2 = new Accounting(20000.0);
        System.out.println("Value of supply : " + v2.valueOfSupply);
        System.out.println("VAT : " + v2.getVat());
        System.out.println("Total : " + v2.getTotal());
    }
}

