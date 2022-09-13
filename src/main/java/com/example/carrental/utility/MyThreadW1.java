package com.example.carrental.utility;

public class MyThreadW1 implements Runnable {
    public static void main(String[] args) {
        MyThreadW1 mt = new MyThreadW1();
        Thread thread = new Thread(() -> System.out.println("Hello Freak"));
        thread.start();
    }


    @Override
    public void run() {
    }
}
