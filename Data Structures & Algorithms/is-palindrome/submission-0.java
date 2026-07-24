class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0,right=s.length()-1;
        while(left<=right)
        {
            if(Character.isLetterOrDigit(s.charAt(left))==true&&Character.isLetterOrDigit(s.charAt(right))==true)
            {
                if(
                    s.charAt(left)==s.charAt(right)
                )
                {
                left++;
                right--;
                }
                else
                {
                    return false;
                }
            }
            else if(Character.isLetterOrDigit(s.charAt(left))==false&&Character.isLetterOrDigit(s.charAt(right))==true)
            {
                left++;
            }
            else if(Character.isLetterOrDigit(s.charAt(left))==true&&Character.isLetterOrDigit(s.charAt(right))==false)
            {
                right--;
            }
            else if(Character.isLetterOrDigit(s.charAt(left))==false&&Character.isLetterOrDigit(s.charAt(right))==false)
            {
                left++;
                right--;
            }
        }
        return true;
    }
}