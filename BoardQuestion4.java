public class BoardQuestion4
{
    public static void main(double P, double r, double n, char ch)
    {
        double A;
        switch(ch)
        {
            case 'T':
            A=P*Math.pow(((100+r)/100),n);
            System.out.println("The maturity amount is"+A);
            break;
            case 'R':
            A=P*n+P*r/100/2/12*n*(n+1);
            System.out.println("The maturity amount is"+A);
            break;
            default:
            System.out.println("Invalid Character");
            break;
        }
    }
}