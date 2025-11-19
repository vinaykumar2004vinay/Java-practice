interface A
{
    int x = 100;
}

class Demo3 implements A
{
    public static int x = 500;
    public static void main(String[] args)
    {
        System.out.println(x);
    }
}