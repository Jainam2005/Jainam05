/*15. Write a program to create an array AW[] of type int and size 8 and fill it with variables.Print those elements which have last digit 3.*/
import java.util.Scanner;
public class BoardQuestion15
{
    int[] AW;
    BoardQuestion15()
    {
        AW=new int[8];
    }
    void initialize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 8 Elements of the Array");
        for(int i=0;i<=AW.length-1;i++)
        {
            AW[i]=sc.nextInt();
        }
    }
    void calc()
    {
        System.out.println("Elements Which have Last Digit 3 are:");
        for(int i=0;i<=AW.length-1;i++)
        {
            if(AW[i]%10==3)
            {
                System.out.println(AW[i]);
            }
        }
    }
    public static void main()
    {
        BoardQuestion15 obj=new BoardQuestion15();
        obj.initialize();
        obj.calc();
    }
}