/*13. Write a program to  temperature of 5 cities and display records in ascending order of  temperature. */
import java.util.Scanner;
public class BoardQuestion13
{
    double[] nArray;
    BoardQuestion13()
    {
        nArray=new double[5];
    }
    void initialize()//Input array
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temperatures of 5 Cities");
        for(int i=0;i<=nArray.length-1;i++)
        {
            nArray[i]=sc.nextDouble();
        }
    }
    void display()//Arrange array
    {
        System.out.println("Temperatures in Ascending Order:");
        for(int i=0;i<=nArray.length-1;i++)
        {
            System.out.print(" "+nArray[i]+" ");
        }
        System.out.println();
    }
    void arrange()
    {
        double temp;
        for(int i=0;i<=nArray.length-2;i++)
        {
            for(int j=0;j<=nArray.length-2;j++)
            {
                if(nArray[j]>nArray[j+1])
                {
                    temp=nArray[j];
                    nArray[j]=nArray[j+1];
                    nArray[j+1]=temp;
                }
            }
        }
        display();
    }
    public static void main()
    {
        BoardQuestion13 obj=new BoardQuestion13();
        obj.initialize();
        obj.arrange();
    }
}