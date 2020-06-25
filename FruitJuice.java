public class FruitJuice
{
    int product_code,pack_size,product_price;
    String flavour,pack_type;
    FruitJuice()
    {
        product_code=0;
        pack_size=0;
        product_price=0;
        flavour="";
        pack_type="";
    }
    public void input(int product_code1, int pack_size1, int product_price1, String flavour1, String pack_type1)
    {
        product_code=product_code1;
        pack_size=pack_size1;
        product_price=product_price1;
        flavour=flavour1;
        pack_type=pack_type1;
    }
    public void discount()
    {
        product_price-=10;
    }
    public void display()
    {
        System.out.println("The product code is"+product_code);
        System.out.println("The flavour is"+flavour);
        System.out.println("The pack type is"+pack_type);
        System.out.println("The pack size is"+pack_size);
        System.out.println("The product price is"+product_price);
    }
    public static void main()
    {
        FruitJuice obj=new FruitJuice();
        obj.input(1111,200,20,"Apple","Pet Bottle");
        obj.discount();
        obj.display();
    }
}