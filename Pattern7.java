import java.util.Scanner;
public class Pattern7
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
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern7 obj=new Pattern7();
        obj.getData();
        obj.generatePattern();
    }
}