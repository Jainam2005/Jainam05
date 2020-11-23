/*11. Write a program in to input and store all roll numbers, names and marks in 3 subjects of n number of students in five single dimensional arrays and display the remark based on average marks as given below:
Average marks = total marks/3
AVERAGE MARKS	REMARK
85 – 100	EXCELLENT
75 – 84	        DISTINCTION
60 – 74	        FIRST CLASS
40 – 59	        PASS
Less than 40	POOR
*/
import java.util.Scanner;
public class BoardQuestion11
{
    int[] Roll_No;
    String[] Name;
    int[] Marks1;
    int[] Marks2;
    int[] Marks3;
    int n;
    BoardQuestion11()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Students");
        n=sc.nextInt();
        Roll_No=new int[n];
        Name=new String[n];
        Marks1=new int[n];
        Marks2=new int[n];
        Marks3=new int[n];
    }
    void Initialize()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Roll Number of Student");
            Roll_No[i]=sc.nextInt();
            System.out.println("Enter the Name of Student");
            Name[i]=sc.next();
            System.out.println("Enter the Marks of First Subject");
            Marks1[i]=sc.nextInt();
            System.out.println("Enter the Marks of Second Subject");
            Marks2[i]=sc.nextInt();
            System.out.println("Enter the Marks of Third Subject");
            Marks3[i]=sc.nextInt();
        }
    }
    double calcAverage(int a, int b, int c)
    {
        int avg;
        avg=(a+b+c)/3;
        return avg;
    }
    void Remark()
    {
        for(int j=0;j<n;j++)
        {
            if((calcAverage(Marks1[j],Marks2[j],Marks3[j])>=85) && (calcAverage(Marks1[j],Marks2[j],Marks3[j])<=100))
            {
                System.out.println("REMARK IS EXCELLENT");
            }
            else if((calcAverage(Marks1[j],Marks2[j],Marks3[j])>=75) && (calcAverage(Marks1[j],Marks2[j],Marks3[j])<85))
            {
            System.out.println("REMARK IS DISTINCTION");
            }
            else if((calcAverage(Marks1[j],Marks2[j],Marks3[j])>=60 && calcAverage(Marks1[j],Marks2[j],Marks3[j])<75))
            {
            System.out.println("REMARK IS FIRST CLASS");
            }
            else if((calcAverage(Marks1[j],Marks2[j],Marks3[j])>=40) && (calcAverage(Marks1[j],Marks2[j],Marks3[j])<60))
            {
            System.out.println("REMARK IS PASS");
            }
            else
            {
            System.out.println("REMARK IS POOR");
            }
            System.out.println("The Name of the Student is"+Name[j]);
            System.out.println("The Roll Number of the Student is"+Roll_No[j]);
        }
    }
    public static void main()
    {
        BoardQuestion11 obj=new BoardQuestion11();
        obj.Initialize();
        obj.Remark();
    }
}