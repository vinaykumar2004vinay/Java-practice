class Calculator
{
    int add1(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }

    int add2(int n1,int n2)
    {
        return n1+n2;
    }
}

public class seven
{
    public static void main(String args[])
    {
        Calculator obj = new Calculator();
        int result = obj.add2(4,3);
        System.out.println(result);
    }
}