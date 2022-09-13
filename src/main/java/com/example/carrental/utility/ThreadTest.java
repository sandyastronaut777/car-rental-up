package com.example.carrental.utility;


 class threadTest implements Runnable {
     public static void main(String[] args) throws InterruptedException {
         threadTest tt = new threadTest();
         Thread T1 = new Thread(tt);
         T1.setName("Multiple");
         T1.start();
         System.out.println(T1.getName());
     }

     @Override
     public void run() {
         for (int i = 1; i <= 10; i++) {
             int res = i * 3;
             System.out.println(res);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }

         }
         System.out.println("current thread: "+Thread.currentThread().getName());
     }
 }
