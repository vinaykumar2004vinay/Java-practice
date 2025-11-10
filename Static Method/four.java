class Mobile
{
    String Brand;
    int Price;
    static String Model;

    public static void show1(Mobile obj)
    {
        System.out.println(obj.Brand + " : " + obj.Price + " : " + Model);
    }

}

public class four
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

        Mobile.show1(obj1);
        Mobile.show1(obj2);
    }
}