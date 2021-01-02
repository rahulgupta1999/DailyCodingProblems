/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Move all negative numbers to beginning and positive to end with constant extra space
 * @author Rahul
 */
public class Problem5 {
    public static void main(String arg[])
    {
        int arr[]={-1,8,-3,4,5,-6,-7};
        int e=arr.length-1;
        for(int i=0; i<e; i++)
        {
            if(arr[i]>0)
            {
                int temp=arr[i];
                arr[i]=arr[e];
                arr[e]=temp;
                e--;
                
            }
        }
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}
