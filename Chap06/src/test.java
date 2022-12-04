public class test {

    //배(0) 등(1)
/*
배열의 합 0: 윳
배열의 합 1: 걸
배열의 합 2: 개
배열의 합 3: 도
배열의 합 4: 모
* */
    public String solution(int[] arr1) {
        String answer = "";

        int sum = 0;

        for(int i:arr1){
            sum += i;
        }

        switch (sum){
            case 0:
                answer = "윷";
                break;
            case 1:
                answer = "걸";
                break;
            case 2:
                answer = "개";
                break;
            case 3:
                answer = "도";
                break;
            case 4:
                answer = "모";
                break;
        }


        return answer;
    }

    public static void main(String[] args) {
        test method = new test();

        int[] arr1 = {0,1,0,0};

        System.out.println(method.solution(arr1));
    }

}
