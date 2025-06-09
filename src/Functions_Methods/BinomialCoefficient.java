package Functions_Methods;

import static Functions_Methods.Factorial.FactWhile;

public class BinomialCoefficient
{
    public static int BinaryCoeff(int n,int r)
    {
        int i=FactWhile(n);
        int j=FactWhile(r);
        int k=FactWhile(n-r);
        int Binomial = i / (j * k);
        return Binomial;
    }
    public static void main(String args[])
    {
        int n=5,r=2;
        int Bin =BinaryCoeff(n,r);
        System.out.println(Bin);
    }
}
