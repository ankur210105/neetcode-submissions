class Solution {
    public boolean isSubsequence(String s, String t) {
        int ps=0;
        if(s.length()<=0)
        return true;
        for(int i=0;i<t.length();i++)
        {
            if(s.charAt(ps)==t.charAt(i))
            {
                ps++; 
            }
            if(ps==s.length())
            return true;
            
        }
        if(ps==s.length())
        return true;
        else
        return false;
    }
}
