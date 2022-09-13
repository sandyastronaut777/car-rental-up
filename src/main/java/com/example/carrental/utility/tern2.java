package com.example.carrental.utility;

import java.util.*;

public class tern2 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = sc.nextInt();
        String grade;
        grade = marks>=90 ? "A" : (marks>=80 ? "B" : "C");
        System.out.println(grade);
    }
}
