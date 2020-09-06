import java.util.Scanner;
public class Automorphic
{
    int num;
    void readNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void findAutomorphic()
    {
        int sq=num*num;
        int c=0, copy=num;
        while(copy>0)
        {
            c++;
            copy=copy/10;
        }
        int end=sq%(int)Math.pow(10,c);
        if(num==end)
        {
            System.out.println("It is an automorphic number");
        }
        else
        {
            System.out.println("It is not an automorphic number");
        }
    }
    public static void main()
    {
        Automorphic obj=new Automorphic();
        obj.readNumber();
        obj.findAutomorphic();
    }
}