package com.example.carrental.sort;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;

@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee>{
    int age;
    String name;
    String department;


    public int compareTo(Employee emp) {
        if(age==emp.age)
            return 0;
        else if(age>emp.age)
            return 1;
        else
            return -1;
    }
}

class SortTest{
    public static void main(String[] args) {

//        ArrayList<Integer> st = new ArrayList<>();
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(33,"ABC", "Developer"));
        list.add(new Employee(27,"XYZ", "Data Analyst"));
        list.add(new Employee(30,"UVW", "Data Scientist"));

        Collections.sort(list);
        for (Employee emp:list) {
            System.out.println(emp.age+" "+emp.name+" "+emp.department);
        }

    }
}
