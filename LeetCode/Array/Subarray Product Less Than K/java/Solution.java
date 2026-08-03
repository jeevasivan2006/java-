class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int kk) {
        // if (kk <= 1) return 0;
        // int totalCount = 0;
        // int j=0;
        // while(j<nums.length){
        //     for(int i=0;i<nums.length-j;i++){
        //         int arr[]=Arrays.copyOfRange(nums,i,i+j);
        //          int product = 1;
        //     for(int k=0;k<arr.length;k++){
        //         product*=arr[k];
        //     }
        //     if(product<kk){
        //         totalCount++;
        //     }
        //     }
        //    j++;
        // }
        // return totalCount;
        int t=0;
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                p*=nums[j];
                if(p<kk){
                    t++;
                }else{
                    break;
                }
            }
        }
        return t;
    }
}