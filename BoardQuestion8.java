/*8. Design a class Park, described as below:
Data members:
EntryFee(double), Age(int), Discount(double), Amount(double)
Member methods:
(i) Park() –Constructor to initialize data members to null.
(ii) Input() – To input values for member data,Entry Fee,Age,Discount
(iii) Calculate()- To calculate the amount payable by giving discount as per the following chart:
Age(in years)                                                Discount on Entry Fee
     <=12                                                              45%
     >= 50                                                             50%
     Otherwise                                                         10% 
(iv) Display() – to display the member data
Write a main() method to create an object of class Park and call the above member methods.*/
import java.util.Scanner;
public class BoardQuestion8
{
    double EntryFee, Discount, Amount;
    int Age;
    BoardQuestion8()
    {
        EntryFee=0.0;
        Age=0;
        Discount=0.0;
        Amount=0.0;
    }
    void Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age");
        Age=sc.nextInt();
        System.out.println("Enter the Entry Fee");
        EntryFee=sc.nextDouble();
    }
    void Calculate()
    {
        if(Age<=12)
        {
            Discount=45*EntryFee/100;
            Amount=EntryFee-Discount;
        }
        else if(Age>=50)
        {
            Discount=50*EntryFee/100;
            Amount=EntryFee-Discount;
        }
        else
        {
            Discount=10*EntryFee/100;
            Amount=EntryFee-Discount;
        }
    }
    void Display()
    {
        System.out.println("The Entry Fee is"+EntryFee);
        System.out.println("The Age is"+Age);
        System.out.println("The Discount is"+Discount);
        System.out.println("The Amount Payable is"+Amount);
    }
    public static void main()
    {
        BoardQuestion8 obj= new BoardQuestion8();
        obj.Input();
        obj.Calculate();
        obj.Display();
    }
}