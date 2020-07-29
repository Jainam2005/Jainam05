import java.util.Scanner;
public class Telephone
{
    double calls, bill;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        double C=0;
        System.out.println("Enter the number of calls(in C):");
        C=sc.nextInt();
        calls=C;
    }
    void compute()
    {
        if(calls<=100)
        {
            bill=1*calls;
        }
        else if(calls>100 && calls<=150)
        {
            bill=100+(calls-100)*2;
        }
        else
        {
            bill=100+50*2+(calls-150)*2.5;
        }
    }
    void display()
    {
        System.out.println("The amount of telephone bill is Rs." +bill);
    }
    public static void main()
    {
        Telephone obj=new Telephone();
        obj.accept();
        obj.compute();
        obj.display();
    }
}