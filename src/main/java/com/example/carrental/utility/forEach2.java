package com.example.carrental.utility;
import java.util.*;
public class forEach2 {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to traverse");
        String str = sc.nextLine();
        for (String s: str.split(" ")) {
            System.out.println(s);

        }

    }
}
