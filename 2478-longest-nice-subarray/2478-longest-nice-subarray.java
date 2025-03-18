class Solution 
{
    public int longestNiceSubarray(int[] nums) 
    {
        int start=0;
        int ans=0;
        int bitsUnion=0;
        for(int i=0;i<nums.length;i++)
        {
            int newel =nums[i];
            while(( bitsUnion & newel)!=0)
            {
                int starting = nums[start];
                bitsUnion ^= starting;
                start++;
            }
            bitsUnion = bitsUnion | newel;
            ans = Math.max(ans, i-start+1);
        }
        return ans;
    }
}