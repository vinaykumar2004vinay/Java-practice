class Bike1
{
    static int Wheels = 2;
    String Color = " ";
    static void Braking()
    {
        System.out.println("Brake is Applied...");
    }

    public static void main(String args[])
    {
        Bike1 R15  = new Bike1();
        Bike1 Duke = new Bike1();
        Bike1 Ktm  = new Bike1();

        R15.Braking();
        Duke.Braking();
        Ktm.Braking();
    }
}