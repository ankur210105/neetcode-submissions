class Solution {
    public boolean wordPattern(String s, String w) {
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        String[] t=w.split(" ");
        if(s.length()!=t.length)
        return false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String st=t[i];
            if(map1.containsKey(ch))
            {
                if(!map1.get(ch).equals(st))
                return false;
            }
            else
            map1.put(ch,st);
            if(map2.containsKey(st))
            {
                if(!map2.get(st).equals(ch))
                return false;
                
            }
           else
                map2.put(st,ch);
        }
        // for(int i=0;i<s.length();i++)
        // {
        //     i
        // }
        // if(map1.size()!=map2.size())
        // return false;
        
        return true;
    }
}