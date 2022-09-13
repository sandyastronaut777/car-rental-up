package com.example.carrental.utility;

import java.util.Scanner;

public class reverse {

    public static void rev(int n) {
        if (n < 10) {
            System.out.println(n);

        } else {
            System.out.print(n % 10);
            rev(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. not starting with zero");
        int num = sc.nextInt();
//        num=(((num%10)*10)+(num/10));
//        System.out.println(num);
        rev(num);
    }
}

