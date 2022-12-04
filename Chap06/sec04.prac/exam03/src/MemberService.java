public class MemberService {
    String id;
    String pw;

    boolean login(String id, String pw){
        if(id.equals("홍길동") && pw.equals("12345")){
            return true;
        } else {
            return false;
        }
    }

    void logOut(String id){
        System.out.println("로그아웃 되었습니다");
    }
}
