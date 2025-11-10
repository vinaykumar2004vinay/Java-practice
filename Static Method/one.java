class Mobile
{
    String Brand;
    int Price;
    static String Model;

    public void show()
    {
        System.out.println(Brand + " : " + Price + " : " + Model);
    }

    public static void show1()
    {
        System.out.println("In Static Method");
    }

}

public class one
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.Brand = "Apple";
        obj1.Price = 75000;
        obj1.Model = "Iphone";

        Mobile obj2 = new Mobile();
        obj2.Brand = "Samsung";
        obj2.Price = 45000;
        obj2.Model = "Galaxy";

        obj1.Model = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1();
    }
}