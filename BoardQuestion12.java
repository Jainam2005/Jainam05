import java.util.Scanner;
public class BoardQuestion12
{
    char[] nArray;
    BoardQuestion12()
    {
        nArray=new char[20];
    }
    void initialize()//To input array
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 20 Characters");
        for(int i=0;i<=nArray.length-1;i++)
        {
            nArray[i]=sc.next().charAt(0);
        }
    }
    void display()//Sort array
    {
        System.out.println("Sorted Array:");
        for(int i=0;i<=nArray.length-1;i++)
        {
            System.out.print(" "+nArray[i]+" ");
        }
        System.out.println();
    }
    void arrange()
    {
        char temp;
        for(int i=0;i<=nArray.length-2;i++)
        {
            for(int j=0;j<=nArray.length-2;j++)
            {
                if(nArray[j]<nArray[j+1])
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
        BoardQuestion12 obj=new BoardQuestion12();
        obj.initialize();
        obj.arrange();
    }
}