package com.example.carrental.utility;

import java.util.Scanner;

public class SBuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your IT domain");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.append(" All the best ahead geek. Go for it !!!");
        System.out.println(sb);
        System.out.println(System.currentTimeMillis());

    }
}

