public class Overload_Series
{
    double series(double n)
    {
        double sum1=0;
        for(int i=1; i<=n; i++)
        {
            sum1=sum1+1.0/i;
        }
        return sum1;
    }
    double series(double a, double n)
    {
        double sum=0, num1=1, num2=2;
        for(int i=1;i<=n;i++)
        {
            sum=sum+num1/Math.pow(a,num2);
            num1+=3;
            num2+=3;
        }
        return sum;
    }
}