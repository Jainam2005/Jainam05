class Square
{
    double side1,area;
    void init(double side)
    {
        side1=side;
    }
    void calc()
    {
        area=side1*side1;
    }
    void display()
    {
        System.out.println("The area is"+area);
    }
} 
