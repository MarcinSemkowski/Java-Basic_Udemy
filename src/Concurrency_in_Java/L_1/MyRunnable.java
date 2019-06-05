package Concurrency_in_Java.L_1;

import static Concurrency_in_Java.L_1.ThreadColor.ANSI_RED;

public class MyRunnable implements  Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + " Hello from  MyRunnable's implementation  of run " );
    }
}
