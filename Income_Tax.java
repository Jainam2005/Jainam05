import java.util.Scanner;
public class Income_Tax
{
    double Income, tax;
    String Name;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the employee(in N):");
        Name=sc.nextLine();
        System.out.println("Enter the Income(in D):");
        Income=sc.nextDouble();
    }
    void compute()
    {
        if(Income<=40000)
        {
            tax=0;
        }
        else if(Income>40000 && Income<=70000)
        {
            tax=(Income-40000)*20/100;
        }
        else if(Income>70000 && Income<=100000)
        {
            tax=30000*20/100+(Income-70000)*30/100;
        }
        else
        {
            tax=30000*20/100+30000*30/100+(Income-100000)*40/100;
        }
    }
    void display()
    {
        System.out.println("The name of the employee is"+Name);
        System.out.println("The tax of the employee is"+tax);
    }
    public static void main()
    {
        Income_Tax obj=new Income_Tax();
        obj.accept();
        obj.compute();
        obj.display();
    }
}