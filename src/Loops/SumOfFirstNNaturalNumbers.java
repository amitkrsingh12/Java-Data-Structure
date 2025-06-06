package Loops;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n natural number whose sum you want?");
        int n=in.nextInt();
        int sum=0;
        int counter=1;
        while(counter<=n)
        {
            sum+=counter;
            counter++;
            //System.out.println(sum);
        }
        System.out.println("Sum of first "+ n +"natural number is  : " +sum);
    }
}
