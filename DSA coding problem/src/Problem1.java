/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 * Write a program to reverse an array
 */

    public class Problem1 {
 
    public static void main(String arg[])
    {
        int arr[]={1,2,3,4,5};
        int start=0; 
        int end= arr.length-1;
        while(start<end)
        {
                                            // a=5, b=12
            arr[start]+=arr[end];           // a=17,b=12
            arr[end]=arr[start]-arr[end];   //a=17,b=5;
            arr[start]=arr[start]-arr[end];//a=12,b=5
            start++;
            end--;
        }
        for(int i: arr)
        {
            System.out.println(i);
        }
    }
}

    
