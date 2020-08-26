import java.util.Scanner;
public class Series1
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n=sc.nextInt();
    }
    void computeSum()
    {
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+(i*i+1);
        }
        System.out.println("The sum of the series is"+sum);
    }
    public static void main()
    {
        Series1 obj=new Series1();
        obj.getData();
        obj.computeSum();
    }
}