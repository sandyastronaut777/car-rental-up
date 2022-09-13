package com.example.carrental.utility;

public class lam {
    public static void main(String[] args) {
        MyLambda lambda = (int a, int b) -> a + b;  //Lambda expressions basically express instances of functional interfaces (An interface with single abstract method is called functional interface
        System.out.println("sum = "+lambda.free(12,17));
        Multi lambda2 = (int a) -> System.out.println("multiple of no. with 2 = "+2*a);
        lambda2.mul(5);


    }
    interface MyLambda {
        int free(int u, int v);

    }

    interface Multi{
        void mul(int x);
    }
}