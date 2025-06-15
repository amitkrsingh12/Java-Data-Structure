package PriyaranjanSir;

import java.util.Scanner;

public class a27_SwitchCase
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter grad?");
        char grade = in.nextLine().charAt(0);
        switch (grade)
        {
            case 'a':
            case 'A':
                System.out.println("Excellent.");
                break;
            case 'b':
            case 'B':
                System.out.println("Very good.");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
