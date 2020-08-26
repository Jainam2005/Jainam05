import java.util.Scanner;
public class Series3
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
            if(i%2!=0)
            {
                sum=sum+i;
            }
            else
            {
                sum=sum-i;
            }
        }
        System.out.println("The sum of the series is"+sum);
    }
    public static void main()
    {
        Series3 obj=new Series3();
        obj.getData();
        obj.computeSum();
    }
}