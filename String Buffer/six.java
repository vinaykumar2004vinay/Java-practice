class six
{
    public static void main(String args[])
    {
        StringBuffer s = new StringBuffer("Vinay");
        s.append(" Kumar");
        s.insert(0,"java ");
        System.out.println(s);    //Vinay Kumar
    }
}