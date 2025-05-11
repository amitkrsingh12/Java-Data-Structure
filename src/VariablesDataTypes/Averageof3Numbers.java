package VariablesDataTypes;

import java.util.Scanner;

public class Averageof3Numbers
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sub1=in.nextInt();
        int sub2=in.nextInt();
        int sub3=in.nextInt();
        float avg = (float)(sub1+sub2+sub3)/n;
        System.out.println(avg);
    }
}
