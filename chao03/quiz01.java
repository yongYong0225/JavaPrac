public class quiz01 {
    public static void main(String[] args){
        int pencil = 534;
        int student = 30;

        int pencilsPerStudent = pencil/student;
        System.out.println(pencilsPerStudent);

        int pencilLeft = pencil % student;
        System.out.println(pencilLeft);
    }
}
