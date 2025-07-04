package PriyaranjanSir;

import java.util.Scanner;

public class a60_InsertionSort
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int s, temp, i, j;
        System.out.println("Enter array size?");
        s = in.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter array elements ");
        for (i = 0; i < s; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Array Elements are :");
        for (i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(i=1;i<s;i++)
        {
           temp=arr[i];
           j=i-1;
           while(j>=0 && temp<arr[j])
           {
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=temp;
        }
        System.out.println("Insertion Sort  : ");
        for(i=0;i<s;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        in.close();
    }
}
