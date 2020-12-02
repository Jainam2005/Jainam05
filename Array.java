import java.util.Scanner;
public class Array
{
    int[] nArray;
    int X;
    Array(int arrsize)
    {
        nArray=new int[arrsize];
    }
    void initialize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X");
        X=sc.nextInt();
        System.out.println("Enter the 5 Elements of the Array");
        for(int i=0;i<=nArray.length-1;i++)
        {
            nArray[i]=sc.nextInt();
        }
    }
    void Divisible()
    {
        System.out.println("Elements of the Array which are Divisible by X are:");
        for(int i=0;i<=nArray.length-1;i++)
        {
            if(nArray[i]%X==0)
            {
                System.out.println(nArray[i]);
            }
        }
    }
    void notDivisible()
    {
        System.out.println("Elements of the Array which are Not Divisible by X are:");
        for(int i=0;i<=nArray.length-1;i++)
        {
            if(nArray[i]%X!=0)
            {
                System.out.println(nArray[i]);
            }
        }
    }
    public static void main()
    {
        Array obj=new Array(5);
        obj.initialize();
        obj.Divisible();
        obj.notDivisible();
    }
}