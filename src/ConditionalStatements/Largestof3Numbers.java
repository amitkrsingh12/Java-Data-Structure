package ConditionalStatements;

import java.util.Scanner;

public class Largestof3Numbers
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a=1,b=3,c=6;
        if(a>b && a>c)
        {
            System.out.println("A is largest");
        }else if(b>c &&b>a)
        {
            System.out.println("B is largest");
        }else{
            System.out.println("C is largest");
        }
    }
}
