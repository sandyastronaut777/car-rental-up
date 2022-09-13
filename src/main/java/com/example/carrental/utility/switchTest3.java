package com.example.carrental.utility;
import java.util.*;
public class switchTest3 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int year;
        String branch;
        System.out.println("Enter Branch: CSE, ME");
        branch = sc.next();
        System.out.println("Enter Year: 1 to 4");
        year = sc.nextInt();
        switch(year){
            case 1:
                System.out.println("Physics, Chemistry, Maths");
                break;
            case 2:
                switch(branch) {

                    case "CSE":
                        System.out.println("Data Structure, DBMS, Software Engineering");
                        break;
                    case "ME":
                        System.out.println("Thermodynamics,  ABC");
                        break;
                }
                break;
            case 3:
                switch (branch) {
                    case "CSE":
                        System.out.println("Algorithm, Java, ABC");
                        break;
                    case "ME":
                        System.out.println("Mechanics, Dynamics");
                        break;
                }
                break;

            case 4:
                switch (branch) {
                    case "CSE":
                        System.out.println("Computer Vision, Digital Image Processing");
                        break;
                    case "ME":
                        System.out.println("Strength of Materials, AutoCAD");
                        break;
                }
                break;
            default:
                System.out.println("Wrong Input");

        }
        }
    }
