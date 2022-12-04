public class CarExample {

    public static void main(String[] args) {

        Car car1 = new Car(); //company를 제외하고는 기본값으로 출력됨 (null, 0)
        Car car2 = new Car("자가용"); //color, maxSpeed가 기본값으로 출력됨
        Car car3 = new Car("자가용", "빨강");
        Car car4 = new Car("택시","검정",200);
    }
}
