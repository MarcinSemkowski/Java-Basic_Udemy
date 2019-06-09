package Concurrency_in_Java.L_9;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;
    private ReentrantLock lock;

    public BankAccount(String accountNumber, double initialBalance, ReentrantLock lock) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = lock;
    }

//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }

    public void deposit(double amount) {
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {

                try {
                    balance += amount;
                }finally {
                  lock.unlock();
                }
            }else{
                System.out.println("Could not  get the lock");
            }


        }catch (InterruptedException e){

        }

       /*
       try {

            balance += amount;
        }finally {
            lock.unlock();
        }

        */
    }

    public void withdraw(double amount) {
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {

                try {
                    balance -= amount;
                }finally {
                    lock.unlock();
                }
            }else{
                System.out.println("Could not  get the lock");
            }


        }catch (InterruptedException e){

        }

       /*
       try {

            balance -= amount;
        }finally {
            lock.unlock();
        }

        */
    }

}