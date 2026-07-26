class Solution {
    public boolean wordPattern(String s, String w) {
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        String[] t=w.split(" ");
        if(s.length()!=t.length)
        return false;
        for(int i=0;i<s.length();i++)
        {
            if(map1.containsKey(s.charAt(i)))
            {
                if(!map1.get(s.charAt(i)).equals(t[i]))
                return false;
            }
            else
            map1.put(s.charAt(i),t[i]);
            if(map2.containsKey(t[i]))
            {
                if(!map2.get(t[i]).equals(s.charAt(i)))
                return false;
                
            }
           else
                map2.put(t[i],s.charAt(i));
        }
        return true;
    }
}