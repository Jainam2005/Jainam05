class Cuboid
{
    double l,b,h,area;
    void init(double l1, double b1, double h1)
    {
        l=l1;
        b=b1;
        h=h1;
    }
    double calc()
    {
        area=l*b*h;
        return area;
    }
    void display()
    {
        System.out.println("The area is "+area);
    }
}

