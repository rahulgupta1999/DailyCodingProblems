/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Write a program to reverse an String
 * @author Rahul
 */
public class Problem2 {
    public static void main(String arg[])
    {
        String str="abcdef";
        String res="";
        for(int i=str.length()-1; i>=0; i--)
        {
            res+=Character.toString(str.charAt(i));
        }
         System.out.println(res);
        StringBuilder s= new StringBuilder(str);
        s.reverse();
        System.out.println(s);
    }
}
