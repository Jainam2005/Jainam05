import java.util.Scanner;
public class Factorial
{
    int n, x;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        System.out.println("Enter the value of x");
        x=sc.nextInt();
    }
    int fact(int m)
    {
        int prod=1;
        for(int i=1;i<=m;i++)
        {
            prod=prod*i;
        }
        return prod;
    }
    void computeSum()
    {
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+(Math.pow(x,i))/fact(i);
        }
        System.out.println("The sum of the series is"+sum);
    }
    public static void main()
    {
        Factorial obj=new Factorial();
        obj.getData();
        obj.computeSum();
    }
}