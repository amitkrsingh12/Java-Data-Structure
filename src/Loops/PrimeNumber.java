package Loops;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        boolean isPrime=true;
        System.out.println("Enter a number?");
        n=in.nextInt();
        if(n==2|| n==0 || n==1){
            System.out.println("Not Prime");
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0)
                {
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not a Prime Number");
            }
        }



    }
}
