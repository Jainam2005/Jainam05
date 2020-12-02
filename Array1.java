import java.util.Scanner;
public class Array1
{
    int[] nArray;
    int max, min;
    Array1(int arrsize)
    {
        nArray=new int[arrsize];
    }
    void initialize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 Elements of the Array");
        for(int i=0;i<=nArray.length-1;i++)
        {
            nArray[i]=sc.nextInt();
        }
    }
    void calc()
    {
        for(int i=0;i<=nArray.length-1;i++)
        {
            max=nArray[0];
            min=nArray[0];
            for(int j=1;j<=nArray.length-1;j++)
            {
                if(max<nArray[j])
                {
                    max=nArray[j];
                }
                else if(min>nArray[j])
                {
                    min=nArray[j];
                }
            }
        }
    }
    void display()
    {
        System.out.println("The Maximum Number of the Array is"+max);
        System.out.println("The Minimum Number of the Array is"+min);
    }
    public static void main()
    {
        Array1 obj=new Array1(5);
        obj.initialize();
        obj.calc();
        obj.display();
    }
}