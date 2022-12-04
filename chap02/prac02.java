public class prac02 {

    public static void main(String[]  args){

        String name = "이재용";
        int age = 28;
        String tel1 = "010", tel2 = "6721", tel3 = "8255";

        System.out.println("이름: "+name);
        System.out.print("나이: "+ age + "\n");
        System.out.printf("전화: %1$s-%2$s-%3$s", tel1, tel2, tel3 );
    }
}
