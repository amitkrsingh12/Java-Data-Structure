package PriyaranjanSir;

import java.util.Scanner;

public class a25_NestedCondition_ScCommArts
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks?");
        int marks=in.nextInt();

        if(marks>=65 && marks<=100)
        {
            if(marks>=85)
            {
                System.out.println("Eligible for Sci. Comm and arts.");
            }else if(marks>=75)
            {
                System.out.println("Eligible for Comm and arts.");
            }else{
                System.out.println("Eligible for Arts.");
            }
        }else{
            if(marks>=50 && marks<65)
            {
                System.out.println("Wait for 2nd round.");
            }else{
                System.out.println("Not Eligible");
            }
        }
    }
}
