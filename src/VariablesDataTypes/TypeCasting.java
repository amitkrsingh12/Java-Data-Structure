package VariablesDataTypes;
import java.util.*;
/*
    Typecasting in Java is the process of converting one data type to another
    data type using the casting operator. When you assign a value from one primitive
    data type to another type, this is known as type casting.
 */
public class TypeCasting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = 25.12f;
        int b =(int) a;
        System.out.println(b);
        char ch='A';
        int number =ch;
        System.out.println(number);



    }
}
