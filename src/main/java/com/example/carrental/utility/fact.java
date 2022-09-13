package com.example.carrental.utility;

import java.util.Scanner;

public class fact {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to find factorial");
        int num = sc.nextInt();
        int result = 1;
        while(num>0){
//            System.out.println("main abhi yahin hun");
//            v=v+v*num;
//            System.out.println(v);
            result=result* num;
            num--;
        }
        System.out.println(result);
    }
}

