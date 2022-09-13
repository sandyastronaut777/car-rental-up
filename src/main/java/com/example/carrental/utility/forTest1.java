package com.example.carrental.utility;

public class forTest1 {
    public static void main(String[] args) {
        outer:
        for (int i=1;i<=5;i++){
            inner:
            for(int j=1;j<=i;j++){
                System.out.print("*");
                if(j==4){
                    break outer;
                }
            }
            System.out.println();
        }
    }
}
