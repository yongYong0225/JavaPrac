public class Car {

    //필드
    int gas;

    //생성자

    //메소드
    void setGas(int gas){
        this.gas = gas;
    }

    boolean isLsfrGas(){
        if(gas==0){
            System.out.println("gas가 없습니다.");
            return false;
        }
        return true;
    }

    void run(){
        while(true){
            if(gas > 0){
                System.out.println("달립니다.(gas잔량: "+gas+")");
                gas--;
            } else {
                System.out.println("멈춥니다.(gas잔량: "+gas+")");
                return;
            }
        }
    }
}
