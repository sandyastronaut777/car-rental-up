package com.example.carrental.utility;

public class MyThreadW2 extends Thread {
    public static void main(String[] args) {
        MyThreadW2 t = new MyThreadW2();
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Hello Freak");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello Geek");
    }


}