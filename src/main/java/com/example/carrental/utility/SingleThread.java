package com.example.carrental.utility;

public class SingleThread implements Runnable{
    public static void main(String[] args) {
        SingleThread singleThread = new SingleThread();
        Thread thread = new Thread(singleThread);
        Thread thread1 = new Thread(singleThread);
        System.out.println("Thread calling...");
        thread.start();
        thread1.start();
    }

    @Override
    public void run(){
        System.out.println("Thread working fine");
    }
}
