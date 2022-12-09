package sec01.exam06;

import sec01.exam02.Audio;
import sec01.exam02.RemoteControl;
import sec01.exam02.Television;

public class MyClass {

    RemoteControl rc = new Television();

    //생성자
    MyClass(){

    }

    MyClass(RemoteControl rc){
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    //메소드
    void methodA(){
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(13);
    }

    void methodB(){
        rc.turnOn();
        rc.setVolume(-2);
    }
}
