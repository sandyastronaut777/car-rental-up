package com.example.carrental.utility;

public class stringMethods {

        public static void main (String[] args)
        {
            String s= "SandhyaRani";
            System.out.println("String length = " + s.length());

            System.out.println("Character at 3rd position = " + s.charAt(3));

            System.out.println("Substring " + s.substring(3));

            System.out.println("Substring = " + s.substring(2,5));

            String s1 = "Sandhya";
            String s2 = "Rani";
            System.out.println("Concatenated string = " + s1.concat(s2));

            String s4 = "Learn Share Learn";
            System.out.println("Index of Share " + s4.indexOf("Share"));
            System.out.println("Index of a = " + s4.indexOf('a',3));

            Boolean out = "Freaks".equals("freaks");
            System.out.println("Checking Equality " + out);
            out = "Freaks".equals("Freaks");
            System.out.println("Checking Equality " + out);

            out = "Freaks".equalsIgnoreCase("fReaks ");
            System.out.println("Checking Equality " + out);

            String string1 = "Henlo";
            String string2 = "buddies";

            int out1 = string1.compareTo(string2);
            System.out.println("the difference between ASCII value is="+out1);

            int out2 = string1.compareToIgnoreCase(string2);
            System.out.println("the difference between ASCII value is="+out2);

            String word1 = "FreaKyMe";
            System.out.println("Changing to lower Case " + word1.toLowerCase());

            String word2 = "FreakyME";
            System.out.println("Changing to UPPER Case " + word2.toUpperCase());

            String word4 = " Learn Share Learn ";
            System.out.println("Trimming the word(Start and End Whitespace removed) :" + word4.trim());

            String str1 = "fimmafreak".replace('f' ,'g');
            System.out.println("Replaced f with g : " + str1);
        }
    }


