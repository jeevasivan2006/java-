class Solution {
    public int lengthOfLastWord(String s) {
        String ss[]=s.split(" ");
        int v=ss[ss.length-1].length();
        return v;
    }
}