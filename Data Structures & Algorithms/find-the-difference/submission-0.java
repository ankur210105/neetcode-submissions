class Solution {
    public char findTheDifference(String s, String t) {
        // String st=s+t;
        // HashMap<Character,Integer> map=new HashMap<>();
        int[] ch=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            ch[x-'a']++;
        }
        for(int j=0;j<t.length();j++)
        {
             char y=t.charAt(j);
            ch[y-'a']--;
        }
        for(int n=0;n<26;n++)
        {
            if(ch[n]==-1)
            return (char)(n+'a');
        }
        return ' ';
    }
}