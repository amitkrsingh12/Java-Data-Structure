package PriyaranjanSir;

import java.util.Scanner;

public class a56_Array_InputFromUser
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,arr[]=new int[10];
        System.out.println("Enter Array ELements?");
        for(i=0;i<10;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Array Elements are : ");
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
