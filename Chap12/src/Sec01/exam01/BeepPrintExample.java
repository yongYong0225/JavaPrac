package Sec01.exam01;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0; i<5; i++){
            toolkit.beep();
            try { Thread.sleep(500); } catch(Exception e) {}
        }

        for(int i=0; i<5; i++){
            System.out.printf("띵");
            try { Thread.sleep(500); } catch(Exception e) {}
        }

    }
}
