package com.example.carrental.utility;

import java.util.*;

public class switchTest1 {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: 1, 2, 3");
        int c = sc.nextInt();
        switch(c){
            case 1:
                System.out.println("Good");
                break;
            case 2:
                System.out.println("Better");
                break;
            case 3:
                System.out.println("Best");
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
