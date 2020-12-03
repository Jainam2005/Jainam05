import java.util.Scanner;
public class Linear_Search1
{
    int[] nArray;
    Linear_Search1()
    {
        int[] aArray={5, 3, 8, 4, 9, 2, 1, 12, 90, 15};
        nArray=aArray;
    }
    void search(int n1)
    {
        int pos=1;
        for(int i=0;i<=nArray.length-1;i++)
        {
            if(nArray[i]==n1)
            {
                pos=i;
            }
        }
        if(pos==1)
        {
            System.out.println("Element Not Present");
        }
        else
        {
            System.out.println("Element Present at Position " + (pos+1));
        }
    }
    public static void main()
    {
        Linear_Search1 obj=new Linear_Search1();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Number");
        n=sc.nextInt();
        obj.search(n);
    }
}