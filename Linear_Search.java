import java.util.Scanner;
public class Linear_Search
{
    String[] nameArray;
    String[] telArray;
    void initialize()
    {
        String[] strArray={"Hassan", "Urmi", "Sayali", "Prerna", "Surabhi", "Shabnam", "Saad"};
        String[] numArray={"1111111111", "2222222222", "3333333333", "4444444444", "5555555555", "6666666666", "7777777777"};
        nameArray=strArray;
        telArray=numArray;
    }
    void search(String sname)
    {
        int pos=1;
        for(int i=0;i<=nameArray.length-1;i++)
        {
            if(nameArray[i].equals(sname))
            {
                pos=i;
            }
        }
        if(pos==1)
        {
            System.out.println("Search Unsuccessful. Name Not Enlisted");
        }
        else
        {
            System.out.println("Search Successful. Name: "+nameArray[pos]+" Telephone Number: "+telArray[pos]);
        }
    }
    public static void main()
    {
        Linear_Search obj=new Linear_Search();
        obj.initialize();
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter the Name");
        name=sc.next();
        obj.search(name);
    }
}