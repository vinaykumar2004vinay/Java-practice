class Human
{
    private String Name;
    private int Age;

    public int getAge()
    {
        return Age;
    }

    public void setAge(int Age)
    {
        this.Age = Age;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String n)
    {
        Name = n;
    }

}

public class two
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Vinay");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}