package javaChapter2_11;

class Cal {
    public int sum(int v1, int v2) {
        return v1 + v2;
    }
}

class Cal3 extends Cal { // extends 상속, Cla에 있는 모든 메소드와 변수를 상속받게 됨

}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(2, 1));

        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2, 1)); //c3 인스턴스에 sum 메소드를 호출해줘
    }
}

class Cal2 {
    public int sum(int v1, int v2) {
        return v1 + v2;
    }

    public int minus(int v1, int v2) {
        return v1 - v2;
    }
}
