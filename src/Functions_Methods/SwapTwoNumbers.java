package Functions_Methods;

import java.util.Scanner;

public class SwapTwoNumbers
{
    public static void SwapUsing3rdVariable(int a,int b)
    {
        int temp =a;
        a=b;
        b=temp;
        System.out.println("Using 3 Variables .");
        System.out.println("A after swap : " +a);
        System.out.println("B after swap : " +b);
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number ?");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("A before swap :"+a);
        System.out.println("B before swap :"+b);
        System.out.println("------------------------");
        SwapUsing3rdVariable(a,b);


    }
}
