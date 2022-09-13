package com.example.carrental.utility;

public class Test implements Runnable {
    public static void main(String[] args) {
        Test t = new Test();
        Thread t1 = new Thread(t);
        t1.start();
//        t1.start();
        t.print();

        Thread t2 = Thread.currentThread();
        System.out.println("current " + t2.getName());
        System.out.println(t1.getName());
    }


    @Override
    public void run() {
        System.out.println("Hello");
    }

    void print() {
        System.out.println("World");
    }
}