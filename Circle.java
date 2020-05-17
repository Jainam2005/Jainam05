class Circle
{
    double pi=3.14,r,area;
    void init(double r1)
    {
       r=r1;
    }
    void calc()
    {
        area=pi*(r*r);
    }
    void display()
    {
        System.out.println("The area is "+area);
    }
}