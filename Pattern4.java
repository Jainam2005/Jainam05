import java.util.Scanner;
public class Pattern4
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern");
        n=sc.nextInt();
    }
    void generatePattern()
    {
        char ch=64;
        for(int i=1;i<=n;i++)
        {
            ch++;
            if(i%2!=0)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(""+ch);
                }
            }
            else
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(""+Character.toLowerCase(ch));
                }
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern4 obj=new Pattern4();
        obj.getData();
        obj.generatePattern();
    }
}