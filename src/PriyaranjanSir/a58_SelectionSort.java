package PriyaranjanSir;

import java.util.Scanner;

public class a58_SelectionSort
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int s,temp,i,j;
        System.out.println("Enter array Size?");
        s=in.nextInt();
        int arr[] =new int[s];
        System.out.println("Enter array elemts?");
        for(i=0;i<s;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Array Elements are : ");
        for(i=0;i<s;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(i=0;i<s-1;i++)
        {
            for(j=i+1;j<s;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array after Insertion Sort  : " );
        for(i=0;i<s;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        in.close();
    }
}
