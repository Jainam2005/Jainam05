import java.util.Scanner;
public class BoardQuestion2
{
    String name;
    float base_salary;//Instance Variable
    void input(String name1)//Parametrised Method
    {
        name=name1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base Salary");
        base_salary=sc.nextFloat();
    }
    float salary()
    {
        float total_salary=base_salary*50/100+base_salary;
        return total_salary;
    }
    void display()
    {
        System.out.println("The Name of the Employee is"+name);
    }
    public static void main()
    {
        BoardQuestion2 obj=new BoardQuestion2();
        obj.input("Jainam");
        System.out.println("The Total Salary is"+obj.salary());
        obj.display();
    }
}