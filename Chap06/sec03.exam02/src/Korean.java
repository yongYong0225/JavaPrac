public class Korean {
    //필드
    String nation = "대한민국"; //전부 동일하기 때문에 초기값 설정
    String name; //초기값 설정 x
    String ssn;

    //생성자
    Korean(String name, String ssn){
        //필드를 초기화 해주는 코드
        this.name = name;
        this.ssn = ssn;
    }

}
