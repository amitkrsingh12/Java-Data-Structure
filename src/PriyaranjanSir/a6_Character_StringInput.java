package PriyaranjanSir;

import java.util.Scanner;

public class a6_Character_StringInput
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int roll;
        String name;
        System.out.println("Enter roll ?");
        roll=in.nextInt();
        System.out.println("Enter name ?");
        in.nextLine();
        name=in.nextLine();
        System.out.println("Name    :" +name);
        System.out.println("Roll    :" +roll);
    }
}
