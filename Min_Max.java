import java.util.Scanner;
public class Min_Max
{
    int num;
    void readNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void findMinMax()
    {
        int largest=0, smallest=9,n=num,r;
        while(n!=0)
        {
            r=n%10;
            largest=Math.max(r,largest);
            smallest=Math.min(r,smallest);
            n=n/10;
        }
        System.out.println("The largest digit is"+largest);
        System.out.println("The smallest digit is"+smallest);
    }
    public static void main()
    {
        Min_Max obj=new Min_Max();
        obj.readNumber();
        obj.findMinMax();
    }
}