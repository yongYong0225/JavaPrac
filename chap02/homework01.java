import java.util.Scanner;

public class homework01 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 수:");
        String strNum1 = scanner.nextLine();

        System.out.println("두번째 수:");
        String strNum2 = scanner.nextLine();

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println("덧셈결과: " + result);

    }

}
