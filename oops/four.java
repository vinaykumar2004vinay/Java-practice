class Computer
{
    void playMusic()
    {
        System.out.println("Music Playing....");
    }
    String getMePen(int cost)
    {
        if(cost >=10)
            return "Pen";
        else
            return "Nothing";
    }
}

public class four
{
    public static void main(String args[])
    {
        Computer obj = new Computer();
        obj.playMusic();
        String s=obj.getMePen(15);
        System.out.println(s);
    }
}