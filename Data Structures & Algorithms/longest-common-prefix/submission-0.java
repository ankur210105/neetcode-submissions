class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        char[] ch=strs[0].toCharArray();
        int index=0,count=0,cc=ch.length;
        for(int i=0;i<strs.length;i++)
        {
            char[] ch1=strs[i].toCharArray();
            int j=0;
            count=0;
            index=Math.min(ch.length,ch1.length);
            while(j<index)
            {
                if(ch1[j]!=ch[j])
                break;
                else
                count++;
                j++;
            }
            count=Math.min(cc,count);
            cc=count;
        }
        if(count>=0)
        return strs[0].substring(0,count);
        else
        return "";
    }
}