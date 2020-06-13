public class BoardQuestion10Part2
{
    public static void main(String args[])
    {
        int i, j, num=5;
        for(i=1;i<=num;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(j+"");
            }
            System.out.println("");
        }
    }
}