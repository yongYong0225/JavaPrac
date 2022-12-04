public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();

        boolean result = memberService.login("홍길동","12345");
        if(result){
            System.out.println("로그인 되었습니다");
            memberService.logOut("홍길동");
        } else {
            System.out.println("id 또는 pw가 올바르지 않습니다.");
        }
    }
}
