public class Employee2
{
    double Basic_Pay, Dearness_Allowance, House_Rent_Allowance, Provident_Fund, Net_Pay, Gross_Pay;
    Employee2(double Basic_Pay1)
    {
        Basic_Pay=Basic_Pay1;
        Dearness_Allowance=0;
        House_Rent_Allowance=0;
        Provident_Fund=0;
        Net_Pay=0;
        Gross_Pay=0;
    }
    void calc()
    {
        Dearness_Allowance=25.0*Basic_Pay/100.0;
        House_Rent_Allowance=15.0*Basic_Pay/100.0;
        Provident_Fund=8.33*Basic_Pay/100.0;
        Net_Pay=Basic_Pay+Dearness_Allowance+House_Rent_Allowance;
        Gross_Pay=Net_Pay-Provident_Fund;
    }
    void display()
    {
        System.out.println("The gross pay of the employee is "+Gross_Pay);
    }
    public static void main()
    {
        Employee2 obj=new Employee2(1000.0);
        obj.calc();
        obj.display();
    }
}