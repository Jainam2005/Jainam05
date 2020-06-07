public class BoardQuestion5
{
    public static void main(char ch, int n)
    {
        switch(ch)
        {
            case'1':
            int p, q;
            for(p=1;p<=n;p++)
            {
                for(q=1;q<=p;q++)
                {
                    System.out.print(q+"");
                }
                System.out.println("");
            }
            break;
            case '2':
        int i,j;
        for(i=1;i<=n;i++)
        {
            int k=96;
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print((char)(k+j));
            }
            System.out.println("");
        }
        break;
        default:
        System.out.println("Invalid character");
    }
}
}