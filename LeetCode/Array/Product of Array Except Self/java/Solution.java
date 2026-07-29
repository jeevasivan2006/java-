class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] num=new int[nums.length];
        int pro=1;
        for(int i=0;i<nums.length;i++){
            num[i]=pro;
            pro*=nums[i];
        }
        int res=1;
        for(int i=nums.length-1;i>=0;i--){
            num[i]*=res;
            res*=nums[i];
        }
        return num;
    }
}