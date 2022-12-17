package Sec01.exam04;

public class BeepPrintExample4 {
    public static void main(String[] args) {
        Thread thread = new BeepThread();
        thread.start();

        for(int i=0; i<5; i++){
            System.out.printf("띵");
            try { Thread.sleep(500); } catch(Exception e) {} //동시시작
        }
    }
}
