class Human
{
    private String Name = "Vinay";
    private int Age = 22;

    public int getAge()
    {
        return Age;
    }

    public String getName()
    {
        return Name;
    }

}

public class two
{
    public static void main(String args[])
    {
        Human obj = new Human();

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}