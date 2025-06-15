package PriyaranjanSir;

import java.util.Scanner;

public class a22_Conditions
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int marks;
        System.out.println("Enter marks?");
        marks=in.nextInt();
        if(marks>=90)
        {
            System.out.println("Grade A");
        }else if(marks>=80)
        {
            System.out.println("Grade B");
        }else if(marks>=70)
        {
            System.out.println("Grade C");
        } else if (marks>=60) {
            System.out.println("Grade D");
        }else if(marks>=45){
            System.out.println("Pass");
        }else{
            System.out.println("Try again");
        }
    }
}
