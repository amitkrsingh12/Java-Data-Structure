package Pattern_1;

import java.util.Scanner;

public class InvertedStars
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=4;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
