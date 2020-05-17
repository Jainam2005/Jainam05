class Overloading
{
    void prnsqr(int a, int b)
    {
        System.out.println("int sum is"+(a+b));
    }
    void prnsqr(double c, double d)
    {
        System.out.println("double sum is"+(c+d));
    }
    void prnsqr(float e, float f)
    {
        System.out.println("float sum is"+(e+f));
    }
    void prnsqr(char g, char h)
    {
        System.out.println("Sum not possible");
    }
}