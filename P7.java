import java.util.Scanner;
public class P7
{
    double sales, commission;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sales(in sales):");
        sales=sc.nextDouble();
    }
    void compute()
    {
        if(sales<10000)
        {
            commission=5*sales/100;
        }
        else if(sales>=10000 && sales<=50000)
        {
            commission=8*sales/100;
        }
        else
        {
            commission=10*sales/100;
        }
    }
    void display()
    {
        System.out.println("The commission is"+commission);
    }
    public static void main()
    {
        P7 obj=new P7();
        obj.accept();
        obj.compute();
        obj.display();
    }
}