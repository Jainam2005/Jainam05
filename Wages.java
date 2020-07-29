import java.util.Scanner;
class Wages
{
    double W, H, R;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        double Hours=0;
        System.out.println("Enter the hours of usage(in Hours):");
        Hours=sc.nextInt();
        H=Hours;
        Scanner sb=new Scanner(System.in);
        double Rate=0;
        System.out.println("Enter the rate of usage(in Rate):");
        Rate=sb.nextInt();
        R=Rate;
    }
    void compute()
    {
        if(H>0 && H<=35)
        {
            W=H*R;
        }
        else if(H>35 && H<=60)
        {
            W=35*R+(H-35)*R*1.5;
        }
        else if(H>60 && H<=70)
        {
            W=35*R+25*1.5*R+(H-60)*2*R;
        }
        else
        {
            W=35*R+25*1.5*R+10*2*R;
            System.out.println("Not allowed to work after 70 hours");
        }
    }
    void display()
    {
        System.out.println("The weekly wages are"+W);
    }
    public static void main()
    {
        Wages obj=new Wages();
        obj.accept();
        obj.compute();
        obj.display();
    }
}