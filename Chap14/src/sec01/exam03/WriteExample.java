package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("/Users/mac/Desktop/Java/Chap14/test3.db");

        byte[] array = {10,20,30,40,50};

        os.write(array, 1, 3); // q배열의 1번 인뎃스 부터 3개를 출력

        os.flush();
        os.close();

    }
}