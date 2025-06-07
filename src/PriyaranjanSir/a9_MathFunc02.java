package PriyaranjanSir;

import java.util.Scanner;

public class a9_MathFunc02 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int b,p;
        double r;
        System.out.println("Enter base and power value?");
        b=in.nextInt();
        p=in.nextInt();
        r=Math.pow(b,p);
        System.out.println("Result " +r);
    }
}
