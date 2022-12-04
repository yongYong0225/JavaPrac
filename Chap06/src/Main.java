//*은 1,3,5,7,9 방식으로 늘어남 (i가 1일때 i++일경우 i*2+1)
//공백은 star-1, star-2, star-3 방식으로 반복
public class Main {
    public void solution(int star) {

        for(int i=1; i<=star; i++){
            for(int j=star; j>i; j--){
                System.out.print(" ");
            }
            for(int s=3; s<=i*2+1; s++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Main method = new Main();
        int star = 9;
        method.solution(star);
    }
}