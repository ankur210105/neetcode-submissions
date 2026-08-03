class Solution {
    public void reverseString(char[] s) {
        
        int l=0,r=s.length-1;
        while(l<s.length/2)
        {
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        
        
    }
}
