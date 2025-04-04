package Flowcharts;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number ?");
        int a=in.nextInt();
        int div=2;
        while(div<a)
        {
            if(a%div==0)
            {
                System.out.println("Not Prime");
                System.exit(0);
            }else{
                div=div+1;
            }
        }
        System.out.println("Prime");

        /*
        Below was a hit and trial method which I tried but failed as using if-else the loop doesnt work out
         */

//        if(div<a)
//        {
//            if(a%div==0)
//            {
//                System.out.println("Not Prime");
//            }
//            else{
//                div=div+1;
//            }
//        }
//        else{
//            System.out.println("PRIME");
//        }
    }
}
