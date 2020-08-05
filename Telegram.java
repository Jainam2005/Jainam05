import java.util.Scanner;
public class Telegram
{
    double words, charges;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of words(in words):");
        words=sc.nextInt();
    }
    void compute()
    {
        if(words<=15)
        {
            charges=5;
        }
        else
        {
            charges=5+(words-15)*1;
        }
    }
    void display()
    {
        System.out.println("The telegram charges are Rs."+charges);
    }
    public static void main()
    {
        Telegram obj=new Telegram();
        obj.accept();
        obj.compute();
        obj.display();
    }
}