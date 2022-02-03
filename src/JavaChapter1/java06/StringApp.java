package JavaChapter1.java06;

public class StringApp {
    public static void main(String[] args) {
        System.out.println("Hello World!!"); //String 문자열 (캐릭터들이 모여있는 것)
        System.out.println('H'); // Character 캐릭터는 한 글자를 표현하는 데이터 타입
        System.out.println("H"); // String

        System.out.println("Hello " +
                "World"); // 줄바꿈을 기대하지만 줄바꿈이 되지는 않는다.

        // new line
        System.out.println("Hello \nWorld"); // 줄바꿈

        // escape
        System.out.println("Hello \"World\""); // Hello "World"
    }
}
