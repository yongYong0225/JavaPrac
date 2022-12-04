public class KoreanExample {

    public static void main(String[] args) {

        Korean k1 = new Korean("이재용", "948271-4724614");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        System.out.println("-------------------");

        Korean k2 = new Korean("윤덕현", "847271-4728374");
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);
    }
}
