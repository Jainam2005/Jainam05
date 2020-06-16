class Temperature
{
    double temp;
    Temperature()
    {
        temp=92;
    }
    Temperature(double t)
    {
        temp=t;
    }
    double convert2celsius()
    {
        double cel=(5.0/9.0)*(temp-32);
        return cel;
    }
    public double getTemp()
    {
        return temp;
    }
    public static void main()
    {
        Temperature dayTemp=new Temperature(94);
        System.out.println("Temperature in fahrenheight is"+dayTemp.getTemp());
        System.out.println("Temperature in celsius is"+dayTemp.convert2celsius());
        Temperature dTemp=new Temperature();
        System.out.println("Other Temperature in fahrenheight is"+dTemp.getTemp());
        System.out.println("Other Temperature in celsius is"+dTemp.convert2celsius());
    }
}