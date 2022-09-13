package com.example.carrental.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("please enter the range upto 10 prime number exists");

//        while(a<30)
//        {
//            System.out.println("Please enter valid number atleast 10 prime number exists");
//            a= sc.nextInt();
//        }
        int a = 30;
        int counter;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=2;i<a;i++){
            counter = 0;
            for (int j=2;j<=i/2;j++) {
                if (i % j == 0) {
                    counter++;
                    break;
                }
            }
            if(counter==0){
                    sum = sum + i;
                    list.add(i);
                }
            }
        System.out.println(list);
        System.out.println("Sum of respective prime numbers "+sum);
        }
    }



