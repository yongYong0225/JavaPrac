public class exam02 {
    public static void main(String[] args){
        while(true){
            int a = (int)(Math.random()*6)+1;
            int b = (int)(Math.random()*6)+1;
            System.out.println("("+"눈"+a+","+"눈"+b+")");
            System.out.println("주사위 눈의 합 : " + (a+b));

            if(a+b==5) {
                break;
            }
        }
    }
}
