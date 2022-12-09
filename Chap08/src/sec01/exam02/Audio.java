package sec01.exam02;

public class Audio implements RemoteControl{

    //필드
    private int volume;

    public void turnOn(){
        System.out.println("오디오를 켭니다.");
    }
    public void turnOff() { System.out.println("오디오를 끕니다.");}

    public void setVolume(int volume){
        if(volume>MAX_VOLUME){
            this.volume = MAX_VOLUME;
        } else if(volume<MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 오디오볼륨: " + this.volume);

    }
}
