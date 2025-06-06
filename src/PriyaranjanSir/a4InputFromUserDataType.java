package PriyaranjanSir;

import java.util.Scanner;

public class a4InputFromUserDataType
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        char grade;
        int roll;
        float per;
        double fee;
        String name;
        System.out.println("Enter name ?");
        name=in.nextLine();
        System.out.println("Enter roll ?");
        roll=in.nextInt();
        System.out.println("Enter percentage ?");
        per=in.nextFloat();
        System.out.println("Enter Fee ?");
        fee=in.nextDouble();
        /*
        After reading fee with nextDouble(), the newline character (\n)
        is still in the input buffer.When you call nextLine() for grade,
         it reads this leftover newline instead of waiting for the user input.
         Fix: Add an extra nextLine() before reading the grade.
         */
        in.nextLine();
        System.out.println("Enter grade ?");
        grade =in.nextLine().charAt(0);

        System.out.println("Name        " + name);
        System.out.println("Roll        " + roll);
        System.out.println("Fee         " + fee);
        System.out.println("Percentage  " + per);
        System.out.println("Grade       " + grade);

    }
}
