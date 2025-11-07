class two
{
    public static void main(String args[])
    {
        String s = "civic";
        String ans = "";
        for(int i=4;i>=0;i--)
        {
            ans=ans+s.charAt(i);
        }
        if(ans.equals(s))
        {
            System.out.println("Yes...Its a Palindrome");
        }
        else
        {
            System.out.println("No... its not a Palindrome");
        }
    }
}









// class two {
//     public static void main(String args[]) {
//         String s = "civic";
//         String ans = "";
//         for (int i = 4; i >= 0; i--) {
//             ans = ans + s.charAt(i);
//         }
//         if (ans.equals(s)) {
//             System.out.println("Yes... It's a Palindrome");
//         } else {
//             System.out.println("No... It's not a Palindrome");
//         }
//     }
// }