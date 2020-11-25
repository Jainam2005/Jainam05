/*14. Fill an array of size 10 and type double.Print those elements of the array that are larger than the average of the elements of the array. */
import java.util.Scanner;
public class BoardQuestion14
{
    double[] nArray;//array of type double
    BoardQuestion14()
    {
        nArray=new double[10];
    }
    void initialize()//To input array
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 10 Elements of the Array");
        for(int i=0;i<=nArray.length-1;i++)
        {
            nArray[i]=sc.nextDouble();
        }
    }
    void arrange()
    {
        double sum=0.0;
        for(int i=0;i<=nArray.length-1;i++)
        {
            sum=sum+nArray[i];
        }
        double Average=sum/10;
        System.out.println("Elements of the Array that are Larger than the Average of the Elements of the Array are:");
        for(int j=0;j<=nArray.length-1;j++)
        {
            if(nArray[j]>Average)
            {
                System.out.println(nArray[j]);
            }
        }
    }
    public static void main()
    {
        BoardQuestion14 obj=new BoardQuestion14();
        obj.initialize();
        obj.arrange();
    }
}