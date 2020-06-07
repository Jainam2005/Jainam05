public class BoardQuestion1
{
    public static void main(String args[])
    {
        int i,j,k=1,num=4;
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++,k++)
            {
                System.out.print(k+"");
            }
            System.out.println();
        }
    }
}