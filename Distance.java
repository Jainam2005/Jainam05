import java.util.Scanner;
public class Distance
{
    double distance, fare;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance travelled(in distance):");
        distance=sc.nextDouble();
    }
    void compute()
    {
        if(distance<=1)
        {
            fare=4;
        }
        else if(distance>1 && distance<=5)
        {
            fare=4+4*(distance-1);
        }
        else if(distance>5 && distance<=15)
        {
            fare=4+4*4+(distance-5)*6;
        }
        else
        {
            fare=4+4*4+6*10+(distance-15)*8;
        }
    }
    void display()
    {
        System.out.println("The bill amount is"+fare);
    }
    public static void main()
    {
        Distance obj=new Distance();
        obj.accept();
        obj.compute();
        obj.display();
    }
}