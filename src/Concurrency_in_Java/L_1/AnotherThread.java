package Concurrency_in_Java.L_1;

import static Concurrency_in_Java.L_1.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    public AnotherThread() {
    }

    @Override
    public void run() {
        System.out.println( ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        }catch(InterruptedException e ){
            System.out.println(ANSI_BLUE + "Another thread  woke  me up");
        }

        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");

     }
}
