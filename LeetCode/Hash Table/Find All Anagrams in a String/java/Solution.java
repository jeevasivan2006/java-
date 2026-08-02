class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char s3[]=p.toCharArray();
        Arrays.sort(s3);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
            String c=s.substring(i,i+p.length());
            char ch[]=c.toCharArray();
            Arrays.sort(ch);
            if(Arrays.equals(ch,s3)){
                list.add(i);
            }
        }
        return list;
    }
}