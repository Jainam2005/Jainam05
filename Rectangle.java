class Rectangle
{
    double l,b,area;
    void init()
    {
        l=10.0;
        b=20.0;
    }
    void calc()
    {
        area=l*b;
    }
    void display()
    {
        System.out.println("The area is"+area);
    }
    public static void main()
    {
        Rectangle obj=new Rectangle();
        obj.init();
        obj.calc();
        obj.display();
    }
}
