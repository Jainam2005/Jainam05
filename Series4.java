import java.util.Scanner;
public class Series4
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n=sc.nextInt();
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
            if(i%2==0)
            {
                sum=sum-fact(2*i);
            }
            else
            {
                sum=sum+fact(2*i);
            }
        }
        System.out.println("The sum of the series is"+sum);
    }
    public static void main()
    {
        Series4 obj=new Series4();
        obj.getData();
        obj.computeSum();
    }
}