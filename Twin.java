import java.util.Scanner;
public class Twin
{
    int[] nArray;
    Twin(int arrsize)
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
    void display()
    {
        System.out.println("The Twins of Elements are:");
        for(int j=0;j<=nArray.length-1;j++)
        {
            System.out.println(nArray[j]*2);
        }
    }
    public static void main()
    {
        Twin obj=new Twin(5);
        obj.initialize();
        obj.display();
    }
}