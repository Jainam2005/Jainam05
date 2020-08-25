public class Leap_Year
{
    void compute()
    {
        for(int i=2000;i<=2040;i++)
        {
            if(i%4==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main()
    {
        Leap_Year obj=new Leap_Year();
        obj.compute();
    }
}