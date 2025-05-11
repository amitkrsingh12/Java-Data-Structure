package VariablesDataTypes;

import java.util.Scanner;
/*
        Type Promotion in Expressions
    1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
    2. If one operand is long, float or double the whole expression is promoted to long, float,
        or double respectively.
 */
public class TypePromotionInExpression
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        char a='a';
        char b='b';
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println(b-a);
    }
}
