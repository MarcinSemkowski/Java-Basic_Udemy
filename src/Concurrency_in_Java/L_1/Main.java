package Concurrency_in_Java.L_1;

import static Concurrency_in_Java.L_1.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println( ANSI_PURPLE +"Hello from the main thread");

        Thread anotherThread  = new AnotherThread();
        anotherThread.setName("Another Thread");
        anotherThread.start();
        (new Thread() {
            public void run() {
                System.out.println( ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }).start();
        System.out.println( ANSI_PURPLE + "Hello again from the main threat ");

        Thread newRunnableThread = new Thread( new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class,s implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println( ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again");
                    System.out.println(ANSI_RED + " AnotherThread terminated, so I'm running again ");
                }catch(InterruptedException e){
                    System.out.println(ANSI_RED + " I couldn't wait after all. I was interrupted  ");
                }
            }
        });
        newRunnableThread.start();
    }

}
