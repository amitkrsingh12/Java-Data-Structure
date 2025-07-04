package PriyaranjanSir;

import java.util.Scanner;

public class a64_Matrix_InputFromUser
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,arr[][] = new int [3][3];
        System.out.println("Enter matrix element?");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("arr[" + i + "] [" + j + "]=");
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Matrix element : ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
