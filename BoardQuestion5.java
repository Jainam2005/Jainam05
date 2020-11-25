/*5. Write a program to generate the patterns till n terms based upon the user’s choice of triangle to be displayed.                                             
1                                                 5  5  5  5  5
1 2                                               5  5  5  5
1 2 3                                             5  5  5
1 2 3 4                                           5  5
1 2 3 4 5				          5*/
import java.util.Scanner;
public class BoardQuestion5
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Generate Triangle");
        System.out.println("2. Generate Inverted Triangle");
        System.out.println("Press any integer other than 1/2 to exit");
    }
    void generateTriangle()//Method which will generate normal triangle
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    void generateInvertedTriangle()//Method which will generate Inverted Triangle
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(5+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        BoardQuestion5 obj=new BoardQuestion5();
        char choice;
        int opt;
        do
        {
            obj.generateMenu();
            System.out.println("Enter your selection[1/2]:");
            opt=sc.nextInt();
            if(opt==1)
            {
                obj.generateTriangle();
            }
            else if(opt==2)
            {
                obj.generateInvertedTriangle();
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
