package javaChapter2_10;

class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";

    public static void classMethod() {
        System.out.println(classVar); // OK
//        System.out.println(instanceVar); // Error
    }

    public void instanceMethod() {
        System.out.println(classVar); // OK
        System.out.println(instanceVar); // OK
    }
}

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar); // OK
//        System.out.println(Foo.instanceVar); // Error
        Foo.classMethod();
//        Foo.instanceMethod(); // Error

        System.out.println("==== instance ====");
        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println("==== f1 output ====");
        System.out.println("f1.classVar: "+f1.classVar); // I class var
        System.out.println("f1.instanceVar: "+f1.instanceVar); // I instance var

        System.out.println("==== classVar change reuslt ====");
        f1.classVar = "changed by f1";
        System.out.println("Foo.classVar: "+Foo.classVar); // changed by f1
        System.out.println("f2.classVar: "+f2.classVar); // changed by f1

        System.out.println("==== instanceVar change reuslt ====");
        f1.instanceVar = "changed by f1";
        System.out.println("f1.instanceVar: "+f1.instanceVar); //changed by f1
        System.out.println("f2.instanceVar: "+f2.instanceVar); // I instance var
    }
}
