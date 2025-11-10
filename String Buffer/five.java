class five
{
    public static void main(String args[])
    {
        StringBuffer s = new StringBuffer("Vinay");
        s.append(" Kumar");
        s.deleteCharAt(2);
        System.out.println(s);    //Vinay Kumar
    }
}