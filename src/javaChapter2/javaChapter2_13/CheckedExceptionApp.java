package javaChapter2.javaChapter2_13;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("date3.txt");
            f.write("Hello");
            // close를 하기 전에 예외가 발생할 수 있기 때문에 finally로 처리해야 함

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 만약 f가 null 이 아니라면 close
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

