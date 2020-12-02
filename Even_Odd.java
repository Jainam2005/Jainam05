import java.util.Scanner;
public class Even_Odd
{
    int[] nArray;
    Even_Odd(int arrsize)
    {
        nArray=new int[arrsize];
    }
    void initialize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Elements of the Array");
        for(int i=0;i<=nArray.length-1;i++)
        {
            nArray[i]=sc.nextInt();
        }
    }
    void calcEven()
    {
        System.out.println("The Even Numbers are:");
        for(int i=0;i<=nArray.length-1;i++)
        {
            if(nArray[i]%2==0)
            {
                System.out.println(nArray[i]);
            }
        }
    }
    void calcOdd()
    {
        System.out.println("The Odd Numbers are:");
        for(int i=0;i<=nArray.length-1;i++)
        {
            if(nArray[i]%2!=0)
            {
                System.out.println(nArray[i]);
            }
        }
    }
    public static void main()
    {
        Even_Odd obj=new Even_Odd(10);
        obj.initialize();
        obj.calcEven();
        obj.calcOdd();
    }
}