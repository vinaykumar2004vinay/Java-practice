class Bike
{
    static int Wheels = 2;
    String Color = " ";

    public static void main(String args[])
    {
        Bike R15 = new Bike();
        Bike Duke = new Bike();
        Bike Ktm = new Bike();

        System.out.println("No of Wheels = " + R15.Wheels);
        System.out.println("No of Wheels = " + Duke.Wheels);
        System.out.println("No of Wheels = " + Ktm.Wheels);

        R15.Color    = "Blue";
        Duke.Color   = "Orange";
        Ktm.Color    = "Red";

        System.out.println("Color = " + R15.Color);
        System.out.println("Color = " + Duke.Color);
        System.out.println("Color = " + Ktm.Color);
    }
}