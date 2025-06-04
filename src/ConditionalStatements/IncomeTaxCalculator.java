package ConditionalStatements;
import java.util.*;
/*
Income Tax Calculator
    income < 5L
    0% tax
    income between 5-10L
    20% tax
    income > 10L
    30% tax
 */
public class IncomeTaxCalculator
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter salary ?");
        double income= in.nextDouble();
        double tax;
        if(income<500000)
        {
           tax=0;
        }else if(income>=500000 && income<1000000)
        {
            tax =0.2* income;
        }else{
            tax = income*0.3;
        }
        System.out.println("Your tax is : " +tax);
    }
}
