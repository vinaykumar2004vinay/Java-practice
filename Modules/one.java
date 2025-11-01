class one
{
    public static void main(String args[])
    {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        for(int i = 0; i <= 8; i++)
        {
            if(nums[i] % 2 == 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}