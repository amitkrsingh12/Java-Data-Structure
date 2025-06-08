package Functions_Methods;

import java.util.Scanner;

public class Sum_of2Numbers {
    public static int Sum(int num1,int num2)      // parameters of formal parameters
    {
        int sum=num1+num2;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two number whose sum you want?");
        a=in.nextInt();
        b=in.nextInt();
        System.out.print ("Sum of two numbers : ");
        int sum =Sum(a,b);      //Arguments or actual parameters
        System.out.println(sum);
    }
}
