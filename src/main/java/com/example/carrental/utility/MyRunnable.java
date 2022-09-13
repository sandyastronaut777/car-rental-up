package com.example.carrental.utility;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        go();
    }

    void go() {
        doMore();
        System.out.println("Likes Almonds");
        for(int i=0; i<=7;i++){
            System.out.print(i+" ");
        }
    }

    void doMore() {
        System.out.println("Sandy");
    }
}

class MyTester {
    public static void main(String[] args) throws InterruptedException {
        Runnable mt = new MyRunnable(); //Runnable Object Creation
        Thread t1 = new Thread(mt);   //Thread Instance Created but not started
        t1.start(); //thread moves into the runnable state & is ready to run, waiting to be selected for execution.
        Thread.sleep(1000);
        System.out.println("End");



    }
}
