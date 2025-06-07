package PriyaranjanSir;

import java.io.*;

public class a7_Buffer_Reader
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        char grade;
        int roll;
        float per;
        double fee;
        String name;

        System.out.println("Enter roll ?");
        roll =Integer.parseInt(in.readLine());
        System.out.println("Enter percentage?");
        per=Float.parseFloat(in.readLine());
        System.out.println("Enter fee ?");
        fee=Double.parseDouble(in.readLine());
        System.out.println("Enter name?");
        name=in.readLine();
        System.out.println("Enter grade?");
        grade=(char) in.read();

        System.out.println("Name : " +name);
        System.out.println("Roll : " +roll);
        System.out.println("Per : " +per);
        System.out.println("Fee : " +fee);
        System.out.println("Grade : " +grade);
    }
}
