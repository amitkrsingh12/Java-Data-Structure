package VariablesDataTypes;
import java.util.*;
/*
    Type Conversion

    Conversion happens when:
     * type compatible
     * destination type > source type
    byte -> short -> int -> float -> long -> double

 */
public class TypeConversion {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //This is called implicit/widening ortype conversion
        float n = sc.nextInt();
        System.out.println(n);

//        int n1 =sc.nextFloat();
//        System.out.println(n1);
    }
}
