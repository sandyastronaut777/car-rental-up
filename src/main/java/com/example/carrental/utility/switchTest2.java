package com.example.carrental.utility;

import java.util.*;
public class switchTest2 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int x;
        while (true) {
            System.out.println("Enter numerical value of x");
            x = sc.nextInt();
            System.out.println("Enter option for operation");
            System.out.println("Press 1 for (+2)");
            System.out.println("Press 2 for (+4)");
            System.out.println("Press 3 for (+6)");
            System.out.println("Press 0 for exit");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("case " + ch + " For +2, x = " + (x=x+2));
                    break;
                case 2:
                    System.out.println("case " + ch + " For +4, x =  " + (x=x+4));
                    break;
                case 3:
                    System.out.println("case " + ch + " For +6, x =  " + (x=x+6));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("You've entered wrong input Mr. geek");
            }
        }
    }
}
