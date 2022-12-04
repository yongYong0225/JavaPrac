import java.util.Scanner;


public class quiz05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("아이디 : ");
        String name = scanner.nextLine();

        System.out.println("패스워드 : ");
        String strPassword = scanner.nextLine();
        int passward = Integer.parseInt(strPassword);

        if (name.equals("java")) {
            if (passward == 1234) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("패스워드가 틀렸습니다.");
            }
        } else {
            System.out.println("존재하지 않는 아이디 입니다.");
        }

    }
}
