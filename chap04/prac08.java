public class prac08 {
    public static void main(String[] args) {

        while (true) {
            int num = (int)(Math.random()*20)+1;
            System.out.println(num);

            if(num == 18) {
                break;
            }
        }
        System.out.println("뽑았다 18!!");
    }
}
