class Computer
{
    void playMusic()
    {
        System.out.println("Music Playing....");
    }
    String getMePen(int cost)
    {
        return "Pen";
    }
}

public class three
{
    public static void main(String args[])
    {
        Computer obj = new Computer();
        obj.playMusic();
        String s=obj.getMePen(5);
        System.out.println(s);
    }
}