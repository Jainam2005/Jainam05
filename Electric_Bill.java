import java.util.Scanner;
class Electric_Bill
{
    double bill;
    double units;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the units used(in u):");
        units=sc.nextInt();
    }
    void compute()
    {
        if(units>=0 && units<=100)
        {
            bill=500+(40*units/100);
        }
        else if(units>100 && units<=300)
        {
            bill=500+(100*40/100)+(units-100)*60/100;
        }
        else
        {
            bill=500+(100*40/100)+(200*60/100)+(units-300)*1;
        }
    }
    void print_the_bill()
    {
        System.out.println("The bill is"+bill);
    }
    public static void main()
    {
        Electric_Bill obj=new Electric_Bill();
        obj.accept();
        obj.compute();
        obj.print_the_bill();
    }
}
            