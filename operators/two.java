class two
{
    public static void main(String args[])
    {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            int ans = nums[i];
            if(ans%2==0 && ans%3==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}