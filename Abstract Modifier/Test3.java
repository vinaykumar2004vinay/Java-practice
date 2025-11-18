abstract class Test3
{
    abstract void display();
}

class Display extends Test3
{
    public void display()
    {
        System.out.println("Display Method");
    }
    public static void main(String[] args)
    {
        Display obj = new Display();
        obj.display();    
    }
}