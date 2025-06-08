package Functions_Methods;
import java.util.Scanner;
/*
    Factorial of a number, n=4
    n! = n * (n-1) * (n-2) * (n-3) * ..... 1
 */
public class Factorial
{
    public static int FactWhile(int num)
    {
        int fact=1;
        while(num>0)
        {
            fact =fact*num;
            num--;
        }
        return fact;
    }
    public static int FactForLoop(int num1)
    {
        int fact=1;
        for(int i=1;i<=num1;i++)
        {
            fact =fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number whose factorial you want?");
        int factorial=in.nextInt();
        int f =FactWhile(factorial);
        System.out.println("Using while Loop Factorial of number is : " +f);
        int f1=FactForLoop(factorial);
        System.out.println("Using For Loop Facotrial of number is :" +f1);
    }
}
