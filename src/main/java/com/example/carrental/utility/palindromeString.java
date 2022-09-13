package com.example.carrental.utility;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check Palindrome");
        String str = sc.next();
        String rev = "";
        StringBuffer s = new StringBuffer(str);
//        for(int i=str.length()-1;i>=0;i--){
//            rev=rev+str.charAt(i);
//        }
//        result = rev.equals(str) ? "Palindrome" : " Not Palindrome";
//        System.out.println(result);
//
//    }
      String r = String.valueOf(s.reverse());
       String result = str.equals(r) ? "Palindrome" : " Not Palindrome";
        System.out.println(result);
    }
}
