package PriyaranjanSir;

import java.util.Scanner;

public class a59_BubbleSort
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int s,temp,i,j;
        System.out.println("Enter array size?");
        s=in.nextInt();
        int arr[] =new int[s];
        System.out.println("Enter array elements ");
        for(i=0;i<s;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Array Elements are :");
        for(i=0;i<s;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        for(i=0;i<s-1;i++)
        {
            for(j=0;j<s-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble Sort  : ");
        for(i=0;i<s;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
