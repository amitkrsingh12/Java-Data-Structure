package PriyaranjanSir;

import java.util.Scanner;

public class a61_LinearSearch
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num,s,c=0,i;
        System.out.println("Enter array size?");
        s=in.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter array element?");
        for(i=0;i<s;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Array elements are ?");
        for(i=0;i<s;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Enter number you want to search?");
        num=in.nextInt();
        for(i=0;i<s;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("Position :"+(i+1));
                c++;
            }
        }
        if(c>0)
        {
            System.out.println("Given No Found : " + c + " Time");
        }else{
            System.out.println("Not Found.");
        }
    }
}
