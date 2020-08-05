import java.util.Scanner;
public class Input
{
    String name, zodiac;
    double weight, number;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your zodiac sign");
        zodiac=sc.nextLine();
        System.out.println("Enter your weight");
        weight=sc.nextDouble();
        System.out.println("Enter your lucky number");
        number=sc.nextDouble();
    }
    void display()
    {
        System.out.println("Your name is"+name);
        System.out.println("Your zodiac sign is"+zodiac);
        System.out.println("Your weight is"+weight);
        System.out.println("Your lucky number is"+number);
    }
    public static void main()
    {
        Input obj=new Input();
        obj.input();
        obj.display();
    }
}