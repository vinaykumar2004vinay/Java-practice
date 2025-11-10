class Mobile
{
    static String Brand;
    static int Price;
    static String Model;

    public void show()
    {
        System.out.println(Brand + " : " + Price + " : " + Model);
    }
}

public class four
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        Mobile.Brand = "Apple";
        Mobile.Price = 75000;
        Mobile.Model = "Iphone";

        Mobile obj2 = new Mobile();
        Mobile.Brand = "Samsung";
        Mobile.Price = 45000;
        Mobile.Model = "Galaxy";

        obj1.show();
        obj2.show();
    }
}