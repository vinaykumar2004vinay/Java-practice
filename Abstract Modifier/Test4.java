abstract class Test4
{
    abstract void display();
}

class Display extends Test4
{
    public static void display()
    {
        System.out.println("Display Method");
    }
    public static void main(String[] args)
    {
        display();           //error: display() in Display cannot override display() in Test4
    }
}