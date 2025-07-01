package PriyaranjanSir;

import java.util.Scanner;

public class a62_BinarySearch
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num,s,i,count=0,first=0,mid=0,last;
        System.out.println("Enter array size?");
        s=in.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter array element in order ?");
        for(i=0;i<s;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Array Elements are ?");
        for(i=0;i<s;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Eneter element to search ?");
        num =in.nextInt();
        last=s-1;
        while((first<=last) && (count==0))
        {
            mid =(first+last)/2;
            if(arr[mid]==num)
            {
                count = mid+1;
            }else if(arr[mid]<num)
            {
                first=mid+1;
            }
            else{
                last=mid-1;
            }

        }
        if(count>0)
        {
            System.out.println("Given no found "+count);
        }else{
            System.out.println("Not Found");
        }
    }

}
