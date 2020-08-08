import java.util.Scanner;
class Calculator
{
   static double x,y;
   static char ch;
    Calculator()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number usage(in a):");
        x=sc.nextDouble();
        System.out.println("Enter the second number usage(in b):");
        y=sc.nextDouble();
        System.out.println("Enter the character usage(in c):");
        ch=sc.next().charAt(0);
    }
    double Addition()
    {
        double add=x+y;
        return add;
    }
    double Subtraction()
    {
        double subtract=x-y;
        return subtract;
    }
    double Multiplication()
    {
        double multiply=x*y;
        return multiply;
    }
    double Division()
    {
        double quotient=x/y;
        return quotient;
    }
    public static void main()
   {
      Calculator obj=new Calculator();
      if(ch=='+')
        {
            System.out.println("The sum is"+ obj.Addition());
        }
        else if(ch=='-')
        {
            System.out.println("The subtracted amount is"+ obj.Subtraction());
        }
        else if(ch=='*')
        {
            System.out.println("The product is"+ obj.Multiplication());
        }
        else if(ch=='/')
        {
            System.out.println("The quotient is"+ obj.Division());
        }
        else
        {
            System.out.println("Wrong Character");
        }
    }
}