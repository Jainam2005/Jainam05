import java.util.Scanner;
public class Pattern5
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
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(""+(n-(j-1)));
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(""+(n-(i-1)));
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern5 obj=new Pattern5();
        obj.getData();
        obj.generatePattern();
    }
}