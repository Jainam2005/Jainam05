import java.util.Scanner;
public class Table
{
    double sum, num;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        num=sc.nextDouble();
    }
    void compute()
    {
        for(int i=1;i<=10;i++)
        {
            sum=num*i;
            System.out.println(num+"X"+i+"="+sum);
        }
    }
    public static void main()
    {
        Table obj=new Table();
        obj.input();
        obj.compute();
    }
}