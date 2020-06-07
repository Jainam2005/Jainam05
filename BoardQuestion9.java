public class BoardQuestion9
{
    void series1()
    {
        double s=0;
        for(double i=2.0;i<21;i+=2)
        {
            double n=i;
            if(n%4!=0)
            {
                s=s+n;
            }
            else
            {
                s=s-n;
            }
        }
        System.out.println(s);
    }
    void series2(double x)
    {
        double sum=0;
        for(double i=2;i<=20;i+=3)
        {
            sum=sum+(x/i);
        }
        System.out.println(sum);
    } 
}