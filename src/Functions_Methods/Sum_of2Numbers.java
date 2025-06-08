package Functions_Methods;

import java.util.Scanner;

public class Sum_of2Numbers {
    public static int Sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two number whose sum you want?");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Sum of two numbers ? ");
        System.out.println(Sum(a,b));
    }
}
