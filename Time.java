public class Time
{
    double hr,min, sec, seconds;
    void ACCEPT(double hr1, double min1, double sec1)
    {
        hr=hr1;
        min=min1;
        sec=sec1;
    }
    void Convert()
    {
        seconds=(hr*3600)+(min*60)+sec;
    }
    void showResult()
    {
        System.out.println("The time in seconds is "+seconds);
    }
    public static void main()
    {
        Time obj=new Time();
        obj.ACCEPT(2.0,1.0,1.0);
        obj.Convert();
        obj.showResult();
    }
}