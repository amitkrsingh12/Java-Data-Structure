package PriyaranjanSir;

import java.util.Scanner;

public class a57_Array_MaxMin
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int s,max,min,n,i;
        System.out.println("Enter array size?");
        s=in.nextInt();
        int arr[] =new int[s];
        System.out.println("Enter array elements?");
        for(i=0;i<s;i++)
        {
            arr[i]=in.nextInt();
        }
        max=arr[0];
        min=arr[0];
        System.out.println("Array ELements :");
        for(i=0;i<s;i++)
        {
            System.out.print(arr[i]+ " ");
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println();
        System.out.println("Max     :"+max);
        System.out.println("Min     :"+min);
    }
}
