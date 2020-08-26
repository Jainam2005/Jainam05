import java.util.Scanner;
public class Series2
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
    }
    void computeSum()
    {
        double sum=0, p=0;
        for(int i=1;i<=n;i++)
        {
            p=p+i;
            sum=sum+p;
        }
        System.out.println("The sum of the series is"+sum);
    }
    public static void main()
    {
        Series2 obj=new Series2();
        obj.getData();
        obj.computeSum();
    }
}