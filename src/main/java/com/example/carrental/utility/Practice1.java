package com.example.carrental.utility;

public class Practice1 implements  Runnable{
    public static void main(String[] args) {
        Practice1 p = new Practice1();
        Thread th = new Thread(p);
        th.start();
        Thread t = new Thread(p);
        t.start();

//        t.start();
//        th.start();
        System.out.println("Hello");
        System.out.println("FirstThread "+th.getName());
        System.out.println("SecondThread "+t.getName());

    }

    @Override
    public void run() {
        System.out.println("This is me");
    }
}

