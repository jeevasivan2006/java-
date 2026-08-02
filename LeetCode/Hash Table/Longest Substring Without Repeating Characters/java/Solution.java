/*class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            set.add(ch[i]);
        }
        return set.size();
    }
}
*/class Solution
{
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> hash=new HashSet<>();
        int left=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            while(hash.contains(s.charAt(i)))
            {
                hash.remove(s.charAt(left));
                left++;
            }
            hash.add(s.charAt(i));
            max=Math.max(i-left+1,max);
        }
        return max;
    }
}                                                                