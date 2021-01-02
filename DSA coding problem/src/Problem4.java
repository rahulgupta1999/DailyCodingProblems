/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
public class Problem4 {
    public static void main(String arg[])
    {
        int arr[]={1,0,2,0,0,0,2,2,2,1,1,1};
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
        int s=0,e=arr.length-1;
        for(int i=0; i<e; i++)
        {
         if(arr[i]==0)
         {
             arr[i]=arr[s];
             arr[s]=0;
             s++;
         }
         else if(arr[i]==2)
         {
             arr[i]=arr[e];
             arr[e]=2;
             e--;
         }
        }
        System.out.print("\n");
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
    
}
