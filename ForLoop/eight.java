public class eight
{
    public static void main(String args[])
    {
        int nums[] = {1,2,3,1,4,5,6,1,7,8,1,9,1};
            int count = 0;
            for(int i=0;i<=12;i++)
            {
                if(nums[i]==1)
                {
                    count =count+1;
                }
            }
            System.out.println(count);
    }
}