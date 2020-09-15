import java.util.Scanner;
public class Pattern6
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
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern6 obj=new Pattern6();
        obj.getData();
        obj.generatePattern();
    }
}