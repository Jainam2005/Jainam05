import java.util.Scanner;
public class Palindrome1
{
    String str;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word");
        str=sc.next();
    }
    void checkPalindrome()
    {
        int len=str.length();
        for(int i=0,j=len-1;i<=len-1;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                System.out.println("The String is Not a Palindrome");
                return;
            }
        }
        System.out.println("The String is a Palindrome");
    }
    public static void main()
    {
        Palindrome1 obj=new Palindrome1();
        obj.getData();
        obj.checkPalindrome();
    }
}