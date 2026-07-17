class Solution {
    public boolean isAnagram(String s, String t) {
            
            int b[]=new int[26];
            if(s.length()!=t.length())
            {
                return false;
            }
            for(char c:s.toCharArray())
            b[c-'a']++;
            for(char c:t.toCharArray())
            b[c-'a']--;
            for(int n:b)
            if(n!=0)
            return false;
            return true;
    }
}
