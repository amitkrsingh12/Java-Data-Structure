package PriyaranjanSir;

import java.util.Scanner;

public class a35_ForLoop_PrimeNumberOrNot
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n,i,c=0;
        System.out.println("Enter any number?");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
