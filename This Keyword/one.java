class Human
{
    private String Name;
    private int Age;

    public int getAge()
    {
        return Age;
    }

    public void setAge(int Age,Human obj)
    {
        Human obj1 = obj;
        obj1.Age = Age;
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

public class one
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setAge(22,obj);
        obj.setName("Vinay");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}