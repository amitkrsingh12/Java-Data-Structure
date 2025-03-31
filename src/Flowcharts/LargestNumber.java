package Flowcharts;

import java.util.Scanner;

public class LargestNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers ?");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Largest number :" +a);
        } else if (b>c) {
            System.out.println("Largest :" +b);

        }else{
            System.out.println("Largest : "+c);
        }
    }
}
