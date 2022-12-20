package Sec01.exam07;

public class ex {
    public static void main(String[] args) {

        String url = "홍게에엥";

        //embed 로 변환
        String upload = url.replace("watch?v=","embed/");

        //&(플레이 리스트) 포함되 있으면 그 뒤를 다 짜른다
        if(upload.contains("&")){
            int idx = upload.indexOf("&");
            upload = upload.substring(0,idx);
        }

        System.out.println(upload);

    }


}
