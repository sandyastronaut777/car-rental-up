package com.example.carrental.utility;

import java.util.Scanner;

//public class SBuff {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String str = sc.nextLine();
//        StringBuffer s = new StringBuffer(str);
//        s.append(" Have u been Shit today ?");
//        System.out.println(s);
//        System.out.println(System.currentTimeMillis());
//    }
//}

public class ConcatTest{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<500000; i++){
            sb.append("Dev");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<500000; i++){
            sb2.append("Dev");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

