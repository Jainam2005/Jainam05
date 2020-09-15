import java.util.Scanner;
public class Pattern2
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
                System.out.print(""+j);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern2 obj=new Pattern2();
        obj.getData();
        obj.generatePattern();
    }
}