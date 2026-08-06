class Solution {
    public boolean canPartition(int[] nums) {
        int s=0;
        for(int n:nums)
        s+=n;
        if(s%2!=0)
        return false;
        int val=s/2;
        for(int n:nums)
        {
            if(n==val)
            return true;
        }
        // for(int i=0;i<nums.length;i++)
        // {
        //     int target=v-nums[i]

        // }
        boolean [] dp=new boolean[val+1];
        dp[0]=true;

        for(int num:nums)
        {
            for(int j=val;j>=num;j--)
            {
                dp[j]=dp[j]||dp[j-num];
            }
        }
        return dp[val];
        // return false;
        
    }
}