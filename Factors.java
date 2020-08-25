import java.util.Scanner;
public class Factors
{
    double sum=0, num;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        num=sc.nextDouble();
    }
    void compute()
    {
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main()
    {
        Factors obj=new Factors();
        obj.input();
        obj.compute();
    }
}