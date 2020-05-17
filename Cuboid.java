class Cuboid
{
    double l,b,h,area;
    void init(double l1, double b1, double h1)
    {
        l=l1;
        b=b1;
        h=h1;
    }
    void calc()
    {
        area=l*b*h;
    }
    void display()
    {
        System.out.println("The area is "+area);
    }
}

