package com.example.carrental.utility;

import sun.nio.ch.ThreadPool;

public class PlayHard implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        PlayHard ph = new PlayHard();
        Thread th1 = new Thread(ph);
        Thread th2 = new Thread(ph);
        Thread th3 = new Thread(ph);

        Thread[] a = new Thread[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new Thread();
            a[i].start();
            if (a[i] == a[3]) {
                a[i].setPriority(9);
                a[i].setName("Sandy");
            }
            Thread.sleep(2000);
            System.out.println(a[i].getName() + " -> " + a[i].getPriority());
        }
        th1.start();
        System.out.println(th1.getName());
        th2.start();
        System.out.println(th2.getName());

        System.out.println("Devil presents in Main");
        System.out.println("current thread priority: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(2);
        System.out.println("current thread priority: " + Thread.currentThread().getPriority());

        System.out.println("current thread name: " + Thread.currentThread().getName());


    }
    @Override
    public void run() {
        System.out.println("Henlo guyzz, gud Eve");
    }
}
