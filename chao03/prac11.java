public class prac11 {
    public static void main(String[] arcs) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "등급 입니다.");
    }
}
