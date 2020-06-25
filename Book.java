class Book
{
    String code, title;
    double price;
    Book(double price1, String code1, String title1)
    {
        code=code1;
        title=title1;
        price=price1;
    }
    Book(String code2, String title2, double price2)
    {
        code=code2;
        title=title2;
        price=price2;
    }
    Book(String code3, double price3, String title3)
    {
        code=code3;
        title=title3;
        price=price3;
    }
    String getcode()
    {
        return code;
    }
    String gettitle()
    {
        return title;
    }
    double getprice()
    {
        return price;
    }
    public static void main()
    {
        Book book1=new Book(1000.0,"Jainam","Jainam");
        System.out.println("Book1 code:"+book1.getcode() +" Title is  " +book1.gettitle() +"  Price is " +book1.getprice());
        Book book2=new Book("Fiction","Jainam",2000.0);
        System.out.println("Book2 code:"+book2.getcode() +" Title is  " +book2.gettitle() +"  Price is " +book2.getprice());
        Book book3=new Book("Fantasy",3000.0,"Jainam");
        System.out.println("Book3 code:"+book3.getcode() +" Title is  " +book3.gettitle() +"  Price is " +book3.getprice());
    }
}