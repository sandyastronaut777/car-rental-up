package com.example.carrental.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        ArrayList<String> name = new ArrayList<>();
        for(int i=1; i<7; i++){
            System.out.println("Enter "+ i + " full name");
             firstName = sc.next();
             lastName = sc.next();
             name.add(firstName+" "+lastName);
        }
        System.out.println(name);
        Collections.sort(name);
        System.out.println(name);

    }
}
