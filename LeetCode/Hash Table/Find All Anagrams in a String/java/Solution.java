class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char ch[]=p.toCharArray();
        Arrays.sort(ch);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
            String ss=s.substring(i,i+p.length());
            char c[]=ss.toCharArray();
            Arrays.sort(c);
            if(Arrays.equals(c,ch)){
                list.add(i);
            }
        }
        return list;
    }
}