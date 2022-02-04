package javaChapter2.javaChapter2_13;

import java.io.FileWriter;
import java.io.IOException;

//AutoCloseable을 가지고 있으면 TryWithResource를 사용할 수 있다

public class TryWithResource {
    public static void main(String[] args) {
        // try with resource statements
        try (FileWriter f = new FileWriter("date3.txt")) {
            f.write("Hello");
//            f.close(); // close가 필요없어서 자동으로 회색으로 나옴
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

