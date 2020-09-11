import java.util.Scanner;
public class Area
{
    void area()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Area of Square");
        System.out.println("3. Calculate Area of rectangle");
        System.out.println("Press any integer other than 1/2/3 to exit");
    }
    void area(double r)
    {
        Scanner sc=new Scanner(System.in);
        double area, pi=3.14;
        System.out.println("Enter the radius of the circle");
        r=sc.nextDouble();
        area=pi*r*r;
        System.out.println("The Area of Circle= "+area);
    }
    void area(int side)
    {
        Scanner sc=new Scanner(System.in);
        double area;
        System.out.println("Enter the side of the Square");
        side=sc.nextInt();
        area=side*side;
        System.out.println("The Area of the Square= "+area);
    }
    void area(int length, int breadth)
    {
        Scanner sc=new Scanner(System.in);
        double area;
        System.out.println("Enter the length of the Rectangle");
        length=sc.nextInt();
        System.out.println("Enter the breadth of the Rectangle");
        breadth=sc.nextInt();
        area=length*breadth;
        System.out.println("The Area of the Rectangle= "+area);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Area obj=new Area();
        char choice;
        int opt;
        do
        {
            obj.area();
            System.out.println("Enter your selection[1/2/3]:");
            opt=sc.nextInt();
            if(opt==1)
            {
                obj.area(0.0);
            }
            else if(opt==2)
            {
                obj.area(0);
            }
            else if(opt==3)
            {
                obj.area(0,0);
            }
            else
            {
                return;
            }
            System.out.println("Would you like to continue[y/n]?");
            choice=(sc.next()).charAt(0);
        }while(choice=='y');
    }
}