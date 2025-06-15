package PriyaranjanSir;

import java.util.Scanner;

public class a28_SwitchCase_String
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name?");
        String name =in.nextLine();

        switch (name){
            case "Modi":
                System.out.println("PM of India.");
                break;
            case "Soren":
                System.out.println("CM of Jharkhand.");
                break;
            case "Rahul":
                System.out.println("Pappu of Indian Politics.");
                break;
            default:
                System.out.println("ok.");
        }
    }
}
