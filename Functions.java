public class Functions
{
    double n, random, log, square_root, absolute;
    Functions(double n1)
    {
        n=n1;
    }
    void calc()
    {
        random=Math.random();
        log=Math.log(n);
        absolute=Math.abs(n);
        square_root=Math.sqrt(n);
    }
    void display()
    {
        System.out.println("Natural logarithm of the number is"+log);
        System.out.println("Absolute value of the number is"+absolute);
        System.out.println("Square root of the number is"+square_root);
        System.out.println("Random number is"+random);
    }
    public static void main()
    {
        Functions obj=new Functions(25);
        obj.calc();
        obj.display();
    }
}