package Functions_Methods;

import java.util.Scanner;

public class ProductofTwoNumber
{
    public static int Product(int num1,int num2)
    {
        int product =num1*num2;
        return product;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number ?");
        int a=in.nextInt();
        int b=in.nextInt();
        int product = Product(a,b);
        System.out.println("Product of 2 Numbers :" +product);

    }
}
