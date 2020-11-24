/*1.Write a program in Java to print Floyd’s right angled triangle using the natural numbers.                                                                                  
1
2  3
4  5  6
7  8  9  10*/
import java.util.Scanner;
public class BoardQuestion1
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Rows in the Pattern");
        n=sc.nextInt();
    }
    void generatePattern()
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        BoardQuestion1 obj=new BoardQuestion1();
        obj.getData();
        obj.generatePattern();
    }
}