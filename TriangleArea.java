public class TriangleArea
{
    void area(double base, double height)
    {
        double area1=base*height/2;
        System.out.println("The area is "+area1);
    }
    void area(double s1, double s2, double s3)
    {
        double s=(s1+s2+s3)/2.0;
        double area2=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("The area is "+area2);
    }
    public static void main()
    {
        TriangleArea obj=new TriangleArea();
        obj.area(2.0,3.0);
        obj.area(2.0,3.0,4.0);
    }
}