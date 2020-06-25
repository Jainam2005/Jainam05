public class Student
{
    String name;
    int age;
    double m1,m2,m3,maximum,average;
    Student()
    {
        name="";
        age=0;
        m1=0.0;
        m2=0.0;
        m3=0.0;
        maximum=0.0;
        average=0.0;
    }
    public void input(String name1, int age1, double m11, double m21, double m31)
    {
        name=name1;
        age=age1;
        m1=m11;
        m2=m21;
        m3=m31;
    }
    public void calc()
    {
        average=(m1+m2+m3)/3;
        maximum=(m1>m2&&m1>m3)?m1:(m2>m1&&m2>m3)?m2:m3;
    }
    public void display()
    {
        System.out.println("The name is"+name);
        System.out.println("The age is"+age);
        System.out.println("The marks of the 1st subject is"+m1);
        System.out.println("The marks of the 2nd subject is"+m2);
        System.out.println("The marks of the 3rd subject is"+m3);
        System.out.println("The average is"+average);
        System.out.println("The maximum is"+maximum);
    }
    public static void main()
    {
        Student obj=new Student();
        obj.input("Jainam",15,100.0,99.0,99.0);
        obj.calc();
        obj.display();
    }
}