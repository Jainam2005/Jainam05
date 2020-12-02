import java.util.Scanner;
public class Prime
{
    int[] nArray;
    Prime(int arrsize)
    {
        nArray=new int[arrsize];
    }
    void initialize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 10 Elements of the Array");
        for(int i=0;i<=nArray.length-1;i++)
        {
            nArray[i]=sc.nextInt();
        }
    }
    void display()
    {
        for(int i=0;i<=nArray.length-1;i++)
        {
            int count=0;
            for(int j=2;j<nArray[i];j++)
            {
                if(nArray[i]%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println(nArray[i]+" is a Prime Number");
            }
            else
            {
                System.out.println(nArray[i]+" is not a Prime Number");
            }
        }
    }
    public static void main()
    {
        Prime obj=new Prime(10);
        obj.initialize();
        obj.display();
    }
}