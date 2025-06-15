package PriyaranjanSir;

import java.util.Scanner;

public class a18_CondtitionalOperator_MaximumNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,c,max;
        System.out.println("Enter 3 different number?");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        max=a>b &&a>c? a:b>c?b:c;
        System.out.println("Max of 3 numbers    :"+max);
    }
}
