class Average
{
    double sci,mat,eng,average;
    void init()
    {
        sci=80.0;
        mat=90.0;
        eng=70.0;
    }
    void calc()
    {
        average=(sci+mat+eng)/3;
    }
    void display()
    {
        System.out.println("The average is "+average);
    }
    public static void main()
    {
        Average obj=new Average();
        obj.init();
        obj.calc();
        obj.display();
    }
}
