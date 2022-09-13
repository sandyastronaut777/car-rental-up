package com.example.carrental.utility;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
    class EmployeeCC implements Comparator<EmployeeCC>, Comparable<EmployeeCC> {
        private String name;
        private int age;
        public String getEmpName() {
            return name;
        }

        public int getEmpAge() {
            return age;
        }

        // Overriding the compareTo method
        public int compareTo(EmployeeCC e) {
            return (this.name).compareTo(e.name);
        }

        // Overriding the compare method to sort the age
        public int compare(EmployeeCC e, EmployeeCC e1) {
            return e.age - e1.age;
        }
    }

    public class Emp {

        public static void main(String args[]) {
            // Takes a list o Dog objects
            List<EmployeeCC> list = new ArrayList<EmployeeCC>();

            list.add(new EmployeeCC("Anmol Goyal", 30));
            list.add(new EmployeeCC("Akhil Sharma", 27));
            list.add(new EmployeeCC("Mukesh Upadhyay", 24));
            list.add(new EmployeeCC("Harpreet Kaur", 26));
            list.add(new EmployeeCC("Sandhya Rani", 22));
            Collections.sort(list);   // Sorts the array list

            for(EmployeeCC a: list)   // printing the sorted list of names
                System.out.print(a.getEmpName() + ", ");

            // Sorts the array list using comparator
            Collections.sort(list, new EmployeeCC());
            System.out.println(" ");

            for(EmployeeCC a: list)   // printing the sorted list of ages
                System.out.print(a.getEmpName() +"  : "+ a.getEmpAge() + ", ");
        }
    }
