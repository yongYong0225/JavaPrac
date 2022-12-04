public class prac06 {
    public static void main(String[] args) {
        for (int m=2; m<=12; m++) {
            System.out.println("@@@" + m + "단 @@@");
            for (int n=1; n<=12; n++) {
                System.out.println(m + "X" + n + "=" + (m*n));
            }
        }
    }
}
