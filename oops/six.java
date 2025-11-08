class Calculator
{
    int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
}

public class six
{
    public static void main(String args[])
    {
        Calculator obj = new Calculator();
        int result = obj.add(4,5,3);
        System.out.println(result);
    }
}