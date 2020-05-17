class Overloading2
{
    void prnsqr(int side)
    {
        System.out.println("The area of a square is"+side*side);
    }
    void prnsqr(float l, float b)
    {
        System.out.println("The area of a rectangle is"+l*b);
    }
    void prnsqr(double radius)
    {
        double pi=3.14;
        System.out.println("The area of a circle is"+pi*(radius*radius));
    }
}