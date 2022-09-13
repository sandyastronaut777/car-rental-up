package com.example.carrental.utility;

import java.util.Scanner;

public class whileTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int num = sc.nextInt();
        System.out.println("Enter lim");
        int lim=sc.nextInt();
        int m=1;
        while(m<=lim){
            System.out.println(num+"*"+m+"="+(m*num));
            m++;
        }
    }
}

