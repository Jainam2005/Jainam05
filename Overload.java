public class Overload
{
    void Polygon(int n, char ch)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(""+ch);
            }
            System.out.println();
        }
    }
    void Polygon(int x, int y)
    {
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                System.out.print(""+"@");
            }
            System.out.println();
        }
    }
    void Polygon()
    {
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(""+"*");
            }
            System.out.println();
        }
    }
}