package com.example.carrental.utility;

public class labelTest2 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i<=5; i++) {
            System.out.println();
            inner:
            for (int j=1;j<=10;j++){
                System.out.print(j+" ");
                if(j==9){
                    break inner;
                }
            }
        }
    }
}
