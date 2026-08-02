class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char c[]=s1.toCharArray();
        Arrays.sort(c);
        boolean found=false;
        for(int i=0;i<=s2.length()-s1.length();i++){
            String s=s2.substring(i,i+s1.length());
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            if(Arrays.equals(c,ch)){
                found=true;
            }
        }
        if(found) return true;
        else return false;
    }
}
/*class Solution {
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
}*/