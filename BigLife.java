import java.util.Scanner;
public class BigLife
{
    double Discount, NetAmount, PurchasedAmount;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the purchased amount");
        PurchasedAmount=sc.nextDouble();
    }
    void compute()
    {
        if(PurchasedAmount<=5000)
        {
            Discount=400;
            NetAmount=PurchasedAmount-Discount;
        }
        else if(PurchasedAmount>5000 && PurchasedAmount<=10000)
        {
            Discount=800;
            NetAmount=PurchasedAmount-Discount;
        }
        else if(PurchasedAmount>10000 && PurchasedAmount<=20000)
        {
            Discount=1000;
            NetAmount=PurchasedAmount-Discount;
        }
        else
        {
            Discount=(PurchasedAmount-2000)*3/100+2000;
            NetAmount=PurchasedAmount-Discount;
        }
    }
    void display()
    {
        System.out.println("The Net Amount is"+NetAmount);
        System.out.println("The discount is"+Discount);
        System.out.println("The purchased amount is"+PurchasedAmount);
    }
    public static void main()
    {
        BigLife obj=new BigLife();
        obj.input();
        obj.compute();
        obj.display();
    }
}