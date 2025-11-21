class Parent
{
    void M1()
    {
        System.out.println("Parent class & M1-Method");
    }
}

class Child extends Parent
{
    void M1()
    {
        System.out.println("Child class & M1-Method");
    }
}

public class one
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.M1();
        obj.M1();
    }
}