/*1. Write a program to generate 20 unique random numbers within range of 1 to 100. */
public class BoardQuestion3
{
    void generateNumbers()
    {
        int min=1;
        int max=100;
        for(int i=0;i<20;i++)
        {
            System.out.println("Random Number ["+ (i+1) + "] : " + (int)(Math.random() * (max - min + 1) + min));
        }
    }
    public static void main()
    {
        BoardQuestion3 obj=new BoardQuestion3();
        obj.generateNumbers();
    }
}