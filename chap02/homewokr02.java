import java.util.Scanner;


public class homewokr02 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("[필수 정보 입력]");

        System.out.println("1. 이름: ");
        String name = scanner.nextLine();

        System.out.println("2. 주민번호 앞 6자리: ");
        String nss = scanner.nextLine();

        System.out.println("3. 전화번호: ");
        String num = scanner.nextLine();

        System.out.println();

        System.out.println("[입력된 내용]");
        System.out.println("1. 이름: "+name);
        System.out.println("2. 주민번호 앞 6자리: " + nss);
        System.out.println("3. 전화번호: " + num);


    }
}
