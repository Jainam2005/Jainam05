import java.util.Scanner;
public class Strings
{
    String str;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        str=sc.nextLine();
    }
    void arrange()
    {
        char[] nArray=str.toCharArray();
        char temp;
        for(int i=0;i<=nArray.length-2;i++)
        {
            for(int j=0;j<=nArray.length-2;j++)
            {
                if(nArray[j]>nArray[j+1])
                {
                    temp=nArray[j];
                    nArray[j]=nArray[j+1];
                    nArray[j+1]=temp;
                }
            }
            str=String.copyValueOf(nArray);
        }
        System.out.println("The new string (after arranging the characters in increasing order): "+str);
    }
    public static void main()
    {
        Strings obj=new Strings();
        obj.getData();
        obj.arrange();
    }
}