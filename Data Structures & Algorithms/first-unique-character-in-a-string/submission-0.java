class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map=new HashMap<>();

        for(int t=0;t<s.length();t++)
        {
            map.put(s.charAt(t),map.getOrDefault(s.charAt(t),0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
            return i;

        }
        return -1;
    }
}