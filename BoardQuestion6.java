/*6. WAP to check whether a number is a valid ISBN number or not.
The International Standard Book Number (ISBN)’ which is a unique number. By this number, we can find any book. It is a 10 digit number. The ISBN is legal if 1*digit1 + 2*digit2 + 3*digit3 + 4*digit4 + 5*digit5 + 6*digit6 + 7*digit7 + 8*digit8 + 9*digit9 + 10*digit10 is divisible by 11.
Example: For an ISBN "1259060977"
Sum = 1*10 + 2*9 + 5*8 + 9*7 + 0*6 + 6*5 + 0*4 + 9*3 + 7*2 + 7*1 = 209
Now divide it with 11 = 20%/11 = 0. If the resultant value will be Zero then it is a valide ISBN.*/
import java.util.Scanner;
public class BoardQuestion6
{
    long isbn, c=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The ISBN Code");
        isbn=sc.nextLong();
    }
    void checkISBN()
    {
        for(long i=isbn;i>0;i=i/10)
        {
            c++;
        }
        if(c==10)
        {
            long digit=10, sum=0, r=0;
            for(long j=isbn;j>0;j=j/10)
            {
                r=j%10;
                sum=sum+(r*digit);
                digit--;
            }
            if(sum%11==0)
            {
                System.out.println("Valid ISBN");
            }
            else
            {
                System.out.println("Invalid ISBN");
            }
        }
        else
        {
            System.out.println("Invalid ISBN");
        }
    }
    public static void main()
    {
        BoardQuestion6 obj=new BoardQuestion6();
        obj.input();
        obj.checkISBN();
    }
}