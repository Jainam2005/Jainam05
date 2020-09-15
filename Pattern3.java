import java.util.Scanner;
public class Pattern3
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
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(""+count);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern3 obj=new Pattern3();
        obj.getData();
        obj.generatePattern();
    }
}