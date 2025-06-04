package ConditionalStatements;

import java.util.Scanner;

public class Calculator
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter two integer values ?");
        int a= in.nextInt(), b=in.nextInt();
        System.out.println("Click the sign you want to perform ?");
        char ch =in.next().charAt(0);
        switch(ch){
        case '+' :
            System.out.println(a+b);
            break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Wrong key");
    }



    }
}
