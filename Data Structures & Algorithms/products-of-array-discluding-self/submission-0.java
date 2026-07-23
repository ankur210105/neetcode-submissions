class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] answer=new int[nums.length];
        int p=1;
        for(int i=0;i<nums.length;i++)
        {
            
            if(i==0)
            answer[i]=p;
            else
            answer[i]=answer[i-1]*nums[i-1];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            answer[i]*=p;
           p=nums[i]*p;
        }
        return answer;
    }
}  
