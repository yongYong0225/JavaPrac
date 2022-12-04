public class prac02 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1;

        if(num == 1) {
            System.out.println("1칸 이동해주세요.");
        } else if(num == 2) {
            System.out.println("2칸 이동해주세요.");
        } else if(num == 3) {
            System.out.println("3칸 이동해주세요.");
        } else if(num == 4) {
            System.out.println("4칸 이동해주세요.");
        } else if(num == 5) {
            System.out.println("5칸 이동해주세요.");
        } else if(num == 6) {
            System.out.println("6칸 이동해주세요.");
        }

    }
}
