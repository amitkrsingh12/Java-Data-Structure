package PriyaranjanSir;

import java.util.Scanner;

public class a26_SwitchCase
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter roll no :");
        int roll=in.nextInt();
        switch (roll)
        {
            case 1:
                System.out.println("Amit");
                break;
            case 2:
                System.out.println("Tanya");
                break;
            case 3:
                System.out.println("Kaliya");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
