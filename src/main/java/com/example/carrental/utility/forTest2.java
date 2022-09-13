package com.example.carrental.utility;

import java.util.Scanner;

public class forTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int size = sc.nextInt();
        System.out.println("Enter symbol to print");
        String s=sc.next();
        for(int i=0;i<size;i++){
            for (int j = (size-i);j>1;j--) {
                System.out.print(" ");
            }
                for (int k=0;k<=i;k++){
                    System.out.print(s);
                }
            System.out.println();
        }
    }
}
