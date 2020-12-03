import java.util.Scanner;
public class Line
{
    String[] nArray;
    Line(int arrSize)
    {
        nArray=new String[arrSize];
    }
    void initialize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 Words of the Line");
        for(int i=0;i<=nArray.length-1;i++)
        {
            nArray[i]=sc.next();
        }
    }
    void findLongest()
    {
        int max=nArray[0].length();
        int pos=0;
        for(int i=1;i<=nArray.length-1;i++)
        {
            if(nArray[i].length()>max)
            {
                pos=i;
                max=nArray[i].length();
            }
        }
        System.out.println("The length of the longest word is: "+max+" and the word is: "+nArray[pos]);
    }
    public static void main()
    {
        Line obj=new Line(5);
        obj.initialize();
        obj.findLongest();
    }
}