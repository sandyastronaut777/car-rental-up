package com.example.carrental.utility;

public class tern1 {
    public static void main(String ar[]) {
        String s = "";
////        int value = (s==null ? -1 : s.equals("") ? 0 : Integer.parseInt(s));
//        System.out.println((s!=null ? -1 : s.equals("") ? 0 : Integer.parseInt(s)));

        if (s != null){
            System.out.println(-1);
        }
        else{
            if(s.equals("")){
                System.out.println(0);
            }
            else{
                System.out.println(Integer.parseInt(s));
            }
        }
    }
}