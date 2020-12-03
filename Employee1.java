import java.util.Scanner;
public class Employee1
{
    double[] nArray;
    Employee1()
    {
        nArray=new double[5];
    }
    void initialize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Monthly Salaries of 5 Employees");
        for(int i=0;i<=nArray.length-1;i++)
        {
            nArray[i]=sc.nextDouble();
        }
    }
    void calc()
    {
        int count=0;
        for(int i=0;i<=nArray.length-1;i++)
        {
            if((nArray[i]*12)>100000)
            {
                count++;
            }
        }
        System.out.println("The Number of Employees Earning More than 1 Lakh Per Annum are "+count);
    }
    public static void main()
    {
        Employee1 obj=new Employee1();
        obj.initialize();
        obj.calc();
    }
}