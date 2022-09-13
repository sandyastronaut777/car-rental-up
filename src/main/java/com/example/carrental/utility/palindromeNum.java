package com.example.carrental.utility;

import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to check Palindrome");
        int num = sc.nextInt();
        int temp = num;
        String str;
        int rem=0;
        while(num>0) {
            rem = rem*10 + num%10;
            num = num/10;
        }
        str = (temp == rem) ? "Palindrome number" : "Not Palindrome";
        System.out.println(str);

    }
}
