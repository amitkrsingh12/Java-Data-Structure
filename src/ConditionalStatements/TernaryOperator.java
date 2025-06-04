package ConditionalStatements;

import java.util.Scanner;

public class TernaryOperator
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int marks=in.nextInt();

        String input = (marks>=33)?"Pass":"Fail";
        System.out.println(input);
    }
}
