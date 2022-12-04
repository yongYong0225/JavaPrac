public class CalculatorExample {

    public static void main(String[] args) {

        Calculator myCalc = new Calculator();

        myCalc.powerOn();

        int result1 = myCalc.plus(5,6);
        System.out.println("result1: "+result1);

        double result2 = myCalc.devide(10,4);
        System.out.println("result2: "+result2);

        myCalc.powerOff();
    }
}
