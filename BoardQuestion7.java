/*7. A class, namely Student, has three data members viz. Name. Roll No. and Marks of five subjects. The stream is assigned which is based on the following criteria:                                                                               
Average Marks Stream

90% or above Science with Computers
80% — 89% Science without Computers
70% — 79% Commerce with Maths
60% — 69% Commerce without Maths

Write a program to declare the class, ‘Student’, and define the method of allotment of subjects*/
import java.util.Scanner;
public class BoardQuestion7
{
    String Name;
    int Roll_No, Marks;
    double Average;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        Name=sc.next();
        System.out.println("Enter the Roll Number");
        Roll_No=sc.nextInt();
        System.out.println("Enter the Marks of Five Subjects");
        Marks=sc.nextInt();
    }
    void calc()
    {
        Average=Marks/5;
    }
    void Stream()
    {
        if(Average>=90)
        {
            System.out.println("Science with Computers");
        }
        else if(Average>=80 && Average<90)
        {
            System.out.println("Science without Computers");
        }
        else if(Average>=70 && Average<80)
        {
            System.out.println("Commerce with Maths");
        }
        else if(Average>=60 && Average<70)
        {
            System.out.println("Commerce without Maths");
        }
        else
        {
            System.out.println("No Stream");
        }
    }
    void display()
    {
        System.out.println("The Name is"+Name);
        System.out.println("The Roll Number is"+Roll_No);
    }
    public static void main()
    {
        BoardQuestion7 obj=new BoardQuestion7();
        obj.input();
        obj.calc();
        obj.display();
        obj.Stream();
    }
}