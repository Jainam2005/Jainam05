import java.util.Scanner;
class Bill
{
    double bill;
    double usage;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Internet usage(in mins):");
        usage=sc.nextDouble();
    }
    void generateBill()
    {
        if(usage>0 && usage<=60)
        {
            bill=20;
        }
        else if(usage>60 && usage<=90)
        {
            bill=20+12;
        }
        else if(usage>90 && usage<=105)
        {
            bill=20+12+8;
        }
        else
        {
            bill=20+12+8+(usage-105)*2;
        }
    }
    void display()
    {
        System.out.println("The bill is: Rs."+bill);
    }
    public static void main()
    {
        Bill obj=new Bill();
        obj.getData();
        obj.generateBill();
        obj.display();
    }
}