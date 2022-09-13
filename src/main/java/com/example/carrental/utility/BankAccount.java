package com.example.carrental.utility;

public class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = (balance - amount);
    }
}

class ABJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        ABJob ab = new ABJob();
        Thread T1 = new Thread(ab);
        Thread T2 = new Thread(ab);
        T1.setName("A");
        T2.setName("B");
        T1.start();
        T2.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Overdrawn");
            }
        }
    }

        private void makeWithdrawal(int amount){
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + "is about to withdraw");
                try {
                    System.out.println(Thread.currentThread().getName() + "is going to sleep");
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " woke up");
                account.withdraw(amount);
                System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
            } else {
                System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
            }
        }
    }
