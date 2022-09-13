package com.example.carrental.utility;

public class labelTest1 {
    public static void main(String[] args) {

        label1:
        for (int i = 1; i <= 5; i++) {
            label2:
            for (int j = 1; j <= 5; j++) {
                if (i == 3 || j == 3) {
                    break label1;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
