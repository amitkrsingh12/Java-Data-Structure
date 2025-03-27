package Flowcharts;

import java.util.Scanner;

public class SimpleInterest
{
    public double calculateInterest(double principal,double rate,double time)
    {
        return (principal*rate*time)/100;
    }
    public static void main(String args[])
    {
        double principal,rate,time;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal amount ??");
        principal=in.nextDouble();
        System.out.println("Rate of Interest?");
        rate=in.nextDouble();
        System.out.println("Time ?");
        time=in.nextDouble();
        SimpleInterest s1 = new SimpleInterest();
        double interest = s1.calculateInterest(principal,rate,time);
        System.out.println("Simple Interest : " +interest);
    }
}
