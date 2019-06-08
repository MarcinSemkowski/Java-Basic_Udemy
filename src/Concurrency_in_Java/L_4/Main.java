package Concurrency_in_Java.L_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

import static Concurrency_in_Java.L_4.Main.EOF;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
        ReentrantLock bufferLock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_YELLOW,bufferLock);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_WHITE + "I'm being printed for the Callable class");
                return "This is the callable result";
            }
        });

        try {
            System.out.println(future.get());
        } catch(ExecutionException e) {
            System.out.println("Something went wrong");
        } catch(InterruptedException e) {
            System.out.println("Thread running the task was interrupted");
        }

        executorService.shutdown();


    }
    }


class MyProducer implements  Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }


    public void run() {
        Random random = new Random();
        String[] nums = { "1", "2", "3", "4", "5"};

        for(String num: nums) {
            try {
                System.out.println(color + "Adding..." + num);
                     bufferLock.lock();
                    try {
                        buffer.add(num);
                    }finally {
                        bufferLock.unlock();
                    }
                Thread.sleep(random.nextInt(1000));
            } catch(InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }

        System.out.println(color + "Adding EOF and exiting....");
            bufferLock.lock();
            try {
                buffer.add("EOF");
            }finally {
                bufferLock.unlock();
            }

    }
}

class MyConsumer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public MyConsumer(ArrayBlockingQueue<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }

    public void run() {
       /*
        int counter =0;
        while(true) {
               if(bufferLock.tryLock()){
                   try {
                       if(buffer.isEmpty()) {
                           continue;
                       }
                       if(buffer.get(0).equals(EOF)) {
                           System.out.println(color + "counter = " + counter);
                           counter =0;
                           break;
                       } else {
                           System.out.println(color + "Removed " + buffer.remove(0));
                       }
                   } finally {
                       bufferLock.unlock();
                   }
               }else{
                   counter++;
               }
           */

        Random random = new Random();
        String[] nums = new String[]{"1", "2", "3", "4", "5"};
        String[] var3 = nums;
        int var4 = nums.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String num = var3[var5];

            try {
                System.out.println(this.color + "Adding..." + num);
                this.buffer.put(num);
                Thread.sleep((long)random.nextInt(1000));
            } catch (InterruptedException var9) {
                System.out.println("Producer was interrupted");
            }
        }

        System.out.println(this.color + "Adding EOF and exiting...");

        try {
            this.buffer.put("EOF");
        } catch (InterruptedException var8) {
        }

    }
    }
