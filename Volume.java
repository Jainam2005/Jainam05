import java.util.Scanner;
public class Volume
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Calculate Volume of Sphere");
        System.out.println("2. Calculate Volume of Cylinder");
        System.out.println("3. Calculate Volume of Cone");
        System.out.println("Press any integer other than 1/2/3 to exit");
    }
    void calcSphereVolume()
    {
        Scanner sc=new Scanner(System.in);
        double volume;
        int radius;
        System.out.println("Enter the radius of the Sphere");
        radius=sc.nextInt();
        volume=(4/3)*(3.14)*radius*radius*radius;
        System.out.println("The Volume of the Sphere= "+volume);
    }
    void calcCylinderVolume()
    {
        Scanner sc=new Scanner(System.in);
        double volume;
        int radius, height;
        System.out.println("Enter the radius of the Cylinder");
        radius=sc.nextInt();
        System.out.println("Enter the height of the Cylinder");
        height=sc.nextInt();
        volume=(3.14)*radius*radius*height;
        System.out.println("The Volume of the Cylinder= "+volume);
    }
    void calcConeVolume()
    {
        Scanner sc=new Scanner(System.in);
        double volume;
        int radius, height;
        System.out.println("Enter the radius of the Cone");
        radius=sc.nextInt();
        System.out.println("Enter the height of the Cone");
        height=sc.nextInt();
        volume=0.33*3.14*radius*radius*height;
        System.out.println("The Volume of the Cone= "+volume);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Volume obj=new Volume();
        char choice;
        int opt;
        do
        {
            obj.generateMenu();
            System.out.println("Enter your selection[1/2/3]:");
            opt=sc.nextInt();
            if(opt==1)
            
                obj.calcSphereVolume();
            
            else if(opt==2)
            
                obj.calcCylinderVolume();
            
            else if(opt==3)
            
                obj.calcConeVolume();
            
            else
            
                return;
            
            System.out.println("Would you like to continue [y/n]?");
            choice=(sc.next()).charAt(0);
        }while(choice=='y');
    }
}