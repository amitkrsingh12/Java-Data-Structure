package PriyaranjanSir;

import java.util.Scanner;

public class a23_Vowel
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any character?");
        char ch =in.nextLine().charAt(0);

        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Upper case vowel");
        }else {
            System.out.println("Invalid vowel");
        }
    }
}
