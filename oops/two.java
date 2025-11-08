class Calculator
{
    int add(int n1,int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

public class two
{
    public static void main(String args[])
    {
        int n1 = 5;
        int n2 = 4;

        Calculator obj = new Calculator();
        int result = obj.add(n1,n2);
        System.out.println(result);
    }
}