public class prac03 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;

        switch (num) {
            case 1:
                System.out.println("1칸 이동해주세요.");
                break;
            case 2:
                System.out.println("2칸 이동해주세요.");
                break;
            case 3:
                System.out.println("3칸 이동해주세요.");
                break;
            case 4:
                System.out.println("4칸 이동해주세요.");
                break;
            case 5:
                System.out.println("5칸 이동해주세요.");
                break;
            case 6:
                System.out.println("6칸 이동해주세요.");
                break;
        }

    }
}
