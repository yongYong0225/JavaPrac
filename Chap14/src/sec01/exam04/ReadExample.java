package sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("/Users/mac/Desktop/Java/Chap14/test1.db");

        while (true) {
            int data = is.read(); //1byte 씩 읽기
            if(data == -1) break; //파일 끝에 도달했을 경우 -1을 리턴함
            System.out.println(data);
//            실행결과
//            10
//            20
//            30
        }
        is.close();
    }
}
