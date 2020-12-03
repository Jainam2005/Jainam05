import java.util.Scanner;
public class Sales
{
    int[] nArray;
    Sales(int arrSize)
    {
        nArray=new int[arrSize];
    }
    void initialize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sales of Each Day of the Week");
        for(int i=0;i<=nArray.length-1;i++)
        {
            nArray[i]=sc.nextInt();
        }
    }
    void calc()
    {
        double Total=0.0, Average;
        for(int i=0;i<=nArray.length-1;i++)
        {
            Total=Total+nArray[i];
        }
        Average=Total/7.0;
        System.out.println("The Total Sales is"+Total);
        System.out.println("The Average Sales is"+Average);
    }
    public static void main()
    {
        Sales obj=new Sales(7);
        obj.initialize();
        obj.calc();
    }
}