/*10. Write two separate programs to generate the following patterns using iteration(loop) statements: 
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5*/
import java.util.Scanner;
public class BoardQuestion10Part2
{
    int n;//instance variable
    void getData()
    {
        Scanner sc=new Scanner(System.in);//Taking input using Scanner
        System.out.println("Enter the Number of Rows in the Pattern");
        n=sc.nextInt();
    }
    void generatePattern()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        BoardQuestion10Part2 obj=new BoardQuestion10Part2();
        obj.getData();
        obj.generatePattern();
    }
}