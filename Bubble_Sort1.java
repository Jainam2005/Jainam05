import java.util.Scanner;
public class Bubble_Sort1
{
    int[] nArray;
    Bubble_Sort1(int arrSize)
    {
        nArray=new int[arrSize];
    }
    void initialize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements of the Array");
        for(int i=0;i<=nArray.length-1;i++)
        {
            nArray[i]=sc.nextInt();
        }
    }
    void display()
    {
        for(int i=0;i<=nArray.length-1;i++)
        {
            System.out.print(nArray[i]+" ");
        }
    }
    void arrange()
    {
        int temp;
        for(int i=0;i<=nArray.length-2;i++)
        {
            for(int j=0;j<=nArray.length-2;j++)
            {
                if(nArray[j]<0 && nArray[j+1]>=0)
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
        Bubble_Sort1 obj=new Bubble_Sort1(9);
        obj.initialize();
        obj.arrange();
    }
}