package com.stackroute.pallin;

import java.util.Scanner;
import java.lang.String;

public class Pallin
{
    public static String rev(String originalString)
    {
        String reverseString="";
        Scanner sc = new Scanner(System.in);
        originalString = sc.nextLine();

        for(int i=originalString.length()-1;i>=0;i--)
        {
          reverseString=reverseString+originalString.charAt(i);
        }
//        System.out.println(originalString);
//        System.out.println(reverseString);

        String str1="The given 2 strings are pallindrome";
        String str2="The given 2 strings do not qualify as pallindrome";

        if(originalString==reverseString) {
            return str1;
        } else {
            return str2;
        }
    }
}
