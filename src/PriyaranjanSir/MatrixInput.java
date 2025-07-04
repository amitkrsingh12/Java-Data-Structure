package PriyaranjanSir;

import java.util.Scanner;

public class MatrixInput
{
    public static int [][] readMatrix(int rows,int cols)
    {
        Scanner in = new Scanner(System.in);
        int matrix[][] = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("arr[" + i + "][" + j + "] = ");
                matrix[i][j]=in.nextInt();
            }
        }
        return matrix;
    }
}
