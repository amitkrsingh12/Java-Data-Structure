package PriyaranjanSir;
import java.util.*;
public class a24_PhoneBill
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int nc,mr=100;
        double bill=0;
        System.out.println("Enter no of calls?");
        nc=in.nextInt();
        if(nc>1 && nc<=200)
        {
            bill=mr;
        }
        else if(nc>=201 && nc<=300)
        {
            bill =(nc-200)*.50 +mr;
        }
        else if(nc>=301 && nc<=400)
        {
            bill =(nc-200-100)*.75 +50+mr;
        }
        else if(nc>=401 && nc<=500)
        {
            bill =(nc-200-100-100)*1+75+50+mr;
        } else if (nc<=501) {
            bill =(nc-200-100-100-100)*1.50+100+75+50+mr;
        }
        System.out.println("Bill Amount "+bill);
    }
}
