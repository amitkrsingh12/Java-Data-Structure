package PriyaranjanSir;

import java.util.Scanner;

public class a5_AsciiValue
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int ac;
        char ch;
        System.out.println("Enter any character?");
        ch=in.nextLine().charAt(0);
        ac=ch;  //type casting
        System.out.println("ASCII value of " + ch + " is " +ac);
        System.out.println("Enter a number?");
        ac=in.nextInt();
        ch=(char) ac;       //Explicit  type casting(it can lead to loss of data)
        System.out.println("Character value of "+ ac + " is " +ch);

    }
}
