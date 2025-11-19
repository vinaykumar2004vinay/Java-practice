abstract class Test
{
    abstract void M1();
    abstract void M2();
    void M3()
    {

    }
}

class Demo1 extends Test
{
    void M1()
    {

    }
}


//Demo1 is not abstract and does not override abstract method M2() in Testclass Demo1 extends Test