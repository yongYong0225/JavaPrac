public class prac04 {
    public static void main(String[] args) {
        int time = (int)(Math.random()*4)+8;
        System.out.println("현재시각" + time + "시");

        switch (time) {
            case 8:
                System.out.println("출근을 합시다.");
            case 9:
                System.out.println("회의를 합시다.");
            case 10:
                System.out.println("업무를 봅시다.");
            case 11:
                System.out.println("식사를 합시다.");
        }
    }
}
