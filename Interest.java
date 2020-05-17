class Interest
{
    double P,T,R,SI;
    void init()
    {
        P=2000.0;
        T=5.0;
        R=2.5;
    }
    void calc()
    {
        SI=(P*R*T)/100;
    }
    void display()
    {
        System.out.println("The simple interest is"+SI);
    }
    public static void main()
    {
        Interest obj=new Interest();
        obj.init();
        obj.calc();
        obj.display();
    }
} 
