public class exam06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int s = 9; s >= i; s--) {
                System.out.print(" ");
            }
            for (int j = 3; j<=i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
