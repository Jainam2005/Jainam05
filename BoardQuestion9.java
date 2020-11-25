/*9. Write a program to calculate and print the sum of each of the following series:
(a) Sum = 2-4+6-8+10……-20
(b) Sum = x/2 + x/5 + x/8 + x/11 + …..+ x/20   (x to be input by user)*/
import java.util.Scanner;
public class BoardQuestion9
{
    void seriesA()//Calculate Sum of 1st series
    {
        double sum=0;
        for(int i=2;i<21;i+=2)
        {
            int n=i;
            if(n%4!=0)
            {
                sum=sum+n;
            }
            else
            {
                sum=sum-n;
            }
        }
        System.out.println("The sum of the first series is"+sum);
    }
    void seriesB()//Calculate sum of 2nd series
    {
        double x, sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        x=sc.nextDouble();
        for(int i=2;i<=20;i+=3)
        {
            sum=sum+(x/i);
        }
        System.out.println("The sum of the second series is"+sum);
    }
    public static void main()
    {
        BoardQuestion9 obj=new BoardQuestion9();
        obj.seriesA();
        obj.seriesB();
    }
}