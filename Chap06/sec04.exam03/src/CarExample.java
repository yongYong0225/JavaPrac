public class CarExample {
    public static void main(String[] args) {

        Car mycar = new Car();

        mycar.setGas(5);

        boolean gasState = mycar.isLsfrGas();
        if(gasState){
            System.out.println("출발합니다.");
            mycar.run();
        }

        if(mycar.isLsfrGas()){
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입하세요.");
        }
    }
}
