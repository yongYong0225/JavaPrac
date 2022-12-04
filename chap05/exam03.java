import java.util.Scanner;

public class exam03 {

    public static void main(String[] args){


        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        Scanner scanner = new Scanner(System.in);

        while (run) {

            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택> ");

            int selecltNo = Integer.parseInt(scanner.nextLine());

            if(selecltNo ==1) {
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(scanner.nextLine());
                scores = new int[studentNum];
            } else if(selecltNo ==2){
                for(int i=0; i<scores.length; i++){
                    System.out.print("scores["+i+"]>");
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            } else if(selecltNo ==3){
                for(int i=0; i<scores.length; i++){
                    System.out.println("scores[+"+i+"]:");
                }
            } else if(selecltNo==4){
                int max = 0;
                int sum = 0;
                double avg = 0;
                for(int i=0; i<scores.length; i++){
                    max = (max < scores[i]) ? scores[i] : max;
                    sum += scores[i];
                }
                avg = (double) sum/studentNum;
                System.out.println("최고점수 : "+max);
                System.out.println("평균점수 : "+avg);
            } else if(selecltNo==5){
                run = false;
            }
        }
        System.out.println("시스템 종료");
    }
}
