interface A
{
    int x = 100;
}

class Demo1 implements A
{
    public static void main(String[] args)
    {
        System.out.println(x);
    }
}