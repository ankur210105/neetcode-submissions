class Solution {
    public String longestCommonPrefix(String[] strs) {       
        String s=strs[0];
        int count=s.length();
        for(int i=0;i<strs.length;i++)
        {
            int j=0;
            while(j<Math.min(count,strs[i].length()))
            {
                if(s.charAt(j)!=strs[i].charAt(j))
                break; 
                j++;
            }
            count=j; 
        } 
        return strs[0].substring(0,count);     
    }
}