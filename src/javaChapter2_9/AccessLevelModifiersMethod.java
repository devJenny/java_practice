package javaChapter2_9;

class Greeting {
    // public, protected, default, private
    public static void hi() {
        System.out.println("hi");
    }
}

public class AccessLevelModifiersMethod {

    public static void main(String[] args) {
        Greeting.hi();
    }
}
