import java.util.Scanner;
public class Series
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in the series");
        n=sc.nextInt();
    }
    void computeSum()
    {
        int S=0;
        for(int i=1;i<=n;i++)
        {
            S=S+i;
        }
        System.out.println("The sum is"+S);
    }
    public static void main()
    {
        Series obj=new Series();
        obj.getData();
        obj.computeSum();
    }
}