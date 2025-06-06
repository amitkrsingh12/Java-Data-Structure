package Loops;

import java.util.Scanner;

public class NumbersFrom1toN {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i=1,n;
        System.out.println("Enter N number ?");
        n=in.nextInt();
        while(i<=n)
        {
            System.out.print(i + " ");
            i++;
        }
    }
}
