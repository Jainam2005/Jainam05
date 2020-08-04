import java.util.Scanner;
public class Exponent
{
    double n, x;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in the series");
        n=sc.nextInt();
        Scanner sb=new Scanner(System.in);
        System.out.println("Enter the number");
        x=sb.nextInt();
    }
    void compute()
    {
        double S=0;
        for(int i=0;i<=n;i++)
        {
            S=S+Math.pow(x,i);
        }
        System.out.println("The sum is"+S);
    }
    public static void main()
    {
        Exponent obj=new Exponent();
        obj.input();
        obj.compute();
    }
}