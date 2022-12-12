package sec01.exam01;

public class ArrayIndexOutOExceoptionfBoundsExceoptionExample {
    public static void main(String[] args) {


        //if문을 사용해서 배열의 길이를 조사하면 예외 발생x
        if(args.length ==2){
            String data1 = args[0];
            String data2 = args[1];

            System.out.println(data1);
            System.out.println(data2);
        } else {
            System.out.println("두개의 실행 매개값이 필요함");
        }

    }
}
