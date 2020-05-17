public class BoardQuestion2
{
    String name; 
    float Salary;
    float TotalSalary;
    void init(String name1, float Salary1)
    {
        name=name1;
        Salary=Salary1;
    }
    void salary()
    {
        TotalSalary=50*Salary/100+Salary;
    }
    void Jainam()
    {
        System.out.println("The total salary is"+TotalSalary);
    }
    public static void main()
    {
        BoardQuestion2 obj=new BoardQuestion2();
        obj.init("Jainam", 54000);
        obj.salary();
        obj.Jainam();
    }
}