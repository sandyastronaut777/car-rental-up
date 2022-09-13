package com.example.carrental.utility;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Pool2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(05);
        for(int i=0; i<10; i++){
            Runnable r = new Pool("WorkerThread " + i);
            executorService.execute(r);
            }
        executorService.shutdown();
        while(!executorService.isTerminated()){}
        System.out.println("All Request Completed Successfully");
        }


    }


