public class CalculatorExample {
    public static void main(String[] args) {
        Calculator mycal = new Calculator();

        //정사각형
        double result1 = mycal.areaRectangle(10);
        System.out.println(result1);

        //직사각형
        double result2 = mycal.areaRectangle(10,20);
        System.out.println(result2);

    }
}
