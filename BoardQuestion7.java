public class BoardQuestion7
{
    public static void main(String name, int Roll_No, double M1, double M2, double M3, double M4, double M5)
    {
        System.out.println(name);
        System.out.println(Roll_No);
        System.out.println(M1);
        System.out.println(M2);
        System.out.println(M3);
        System.out.println(M4);
        System.out.println(M5);
        double Average=(M1+M2+M3+M4+M5)/5;
        System.out.println(Average);
        if(Average>=60 && Average<=69)
        {
            System.out.println("Commerce without Maths");
        }
        else if(Average>=70 && Average<=79)
        {
            System.out.println("Commerce with Maths");
        }
        else if(Average>=80 && Average<=89)
        {
            System.out.println("Science without Computers");
        }
        else if(Average>=90)
        {
            System.out.println("Science with Computers");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}
  