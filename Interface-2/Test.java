abstract class A 
{
     public final int X = 100;
     abstract void M1();
}

class B extends A
{
    public void M1(){}
        public static void main(String args[])
        {
            B obj = new B();
            System.out.println(obj.X);
        }
}