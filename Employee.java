public class Employee
{
    int pan;
    String name;
    double taxincome, tax;
    Employee()
    {
        pan=0;
        name="";
        taxincome=0.0;
    }
    public void input(int pan1, String name1, double taxincome1)
    {
        pan=pan1;
        name=name1;
        taxincome=taxincome1;
    }
    public void calc()
    {
        if(taxincome<=100000)
        {
            tax=0;
        }
        else if(taxincome>=100001&&taxincome<=150000)
        {
            tax=(taxincome-100000)*10/100;
        }
        else if(taxincome>=150001&&taxincome<=250000)
        {
            tax=(taxincome-150000)*20/100+5000;
        }
        else
        {
            tax=(taxincome-250000)*30/100+25000;
        }
    }
    public void display()
    {
        System.out.println("Pan Number\tName\t        Tax-income\tTax");
        System.out.println( pan +"     \t"+name+"     \t"+taxincome+"     \t"+tax);
    }
    public static void main()
    {
        Employee obj=new Employee();
        obj.input(1111,"Jainam",300000);
        obj.calc();
        obj.display();
    }
}
    
    