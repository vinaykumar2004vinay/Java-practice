interface A
{
    int x = 100;
}

class Demo2 implements A
{
    public static void main(String[] args)
    {
        int x = 500;
        System.out.println(x);
    }
}