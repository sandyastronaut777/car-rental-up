package com.example.carrental.utility;

public class Pool implements Runnable{
    private String name;

    public Pool(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Start Thread " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End Thread "+ name);

    }
}
