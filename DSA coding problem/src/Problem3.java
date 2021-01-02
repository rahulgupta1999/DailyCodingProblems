/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 * 
 * Kth smallest element
 */
public class Problem3 {
    public static int partition(int arr[], int start, int end)
    {
        int paviot=arr[end],i=start;
        for(int j=start; j<=end-1; j++)
        {
         if(arr[j]<=paviot)
         {
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
         }
        }
        int temp2= arr[i];
        arr[i]=arr[end];
        arr[end]=temp2;
        return i;
        
    }
    public static int findKthmin(int arr[], int k, int s, int end)
    {
        if(k>0 && k<=end-s+1)
        {
        int p=partition(arr,s,end);
        if(p-s==k-1)
        {
            return arr[p]; 
        }
        else if(p-s>k-1)
        {
            return findKthmin(arr,k,s,p-1);
        }
        else
        {
            return findKthmin(arr,k-p+s-1,p+1,end);
        }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String arg[])
    {
        int arr[]={1,5,2,4,3};
        int k=5;
        if(k>arr.length)
        {
            System.out.println("K should be less than size");
        }else
        {
           System.out.println(k+"ht smallest "+findKthmin(arr,k,0,arr.length-1));
           System.out.println(k+"ht greatest "+findKthmin(arr,arr.length-k+1,0,arr.length-1));
        }
    }
}
