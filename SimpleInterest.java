class SimpleInterest
{
    double P,R,T,Answer;
    void init()
    {
        P=2000.0;
        R=2.5;
        T=5.0;
    }
    double calc()
    {
        Answer=(P*R*T)/100;
        return Answer;
    }
    public static void main()
    {
        SimpleInterest obj=new SimpleInterest();
        obj.init();
        double Solution=obj.calc();
        System.out.println("The answer is "+Solution);
    }
} 