class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        com(0,nums,target,list,new ArrayList<>());
        return list;
    }
    public static void com(int index,int nums[],int target,List<List<Integer>> list,List<Integer> temp){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(target<0) return;
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            if(nums[i]>target){
                break;
            }
            temp.add(nums[i]);
            com(i+1,nums,target-nums[i],list,temp);
            temp.remove(temp.size()-1);
        }
    }
}