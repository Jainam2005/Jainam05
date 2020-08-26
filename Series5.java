import java.util.Scanner;
public class Series5
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
    }
    int seqSum(int m)
    {
        int s=0;
        for(int i=1;i<=m;i++)
        {
            s=s+i;
        }
        return s;
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
            sum=sum+(double)seqSum(i+1)/fact(i+1);
        }
        System.out.println("The sum of the series is"+sum);
    }
    public static void main()
    {
        Series5 obj=new Series5();
        obj.getData();
        obj.computeSum();
    }
}