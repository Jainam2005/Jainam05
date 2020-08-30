import java.util.Scanner;
public class Product_Digits
{
    int num;
    void readNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void digitProduct()
    {
        int n=num;
        int digit=1, prod=1;
        while(n!=0)
        {
            digit=n%10;
            prod=prod*digit;
            n=n/10;
        }
        System.out.println("The product of the digits in the number is"+prod);
    }
    public static void main()
    {
        Product_Digits obj=new Product_Digits();
        obj.readNumber();
        obj.digitProduct();
    }
}