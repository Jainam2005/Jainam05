import java.util.Scanner;
public class Average_Digits
{
    int num;
    void readNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void digitAverage()
    {
        int n=num;
        int digit=1, count=0; 
        double average=0;
        while(n!=0)
        {
            count++;
            digit=n%10;
            average=average+digit;
            n=n/10;
        }
        average=average/count;
        System.out.println("The average of the digits in the number is"+average);
    }
    public static void main()
    {
        Average_Digits obj=new Average_Digits();
        obj.readNumber();
        obj.digitAverage();
    }
}