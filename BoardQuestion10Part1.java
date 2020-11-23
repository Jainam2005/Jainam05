/*10. Write two separate programs to generate the following patterns using iteration(loop) statements:
1 *
2 * #
3 * # *
4 * # * #
5 * # * # *
*/
import java.util.Scanner;
public class BoardQuestion10Part1
{
    void generatePattern()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print(i+" ");
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    public static void main()
    {
        BoardQuestion10Part1 obj=new BoardQuestion10Part1();
        obj.generatePattern();
    }
}