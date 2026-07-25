class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        int arr[]=new int[s.length()];
        int j=0;
        while(n>0){
            int r=n%10;
            arr[j]=r;
            j++;
            n/=10;
        }
        int max=0;
        for(int o=0;o<arr.length;o++){
    for(int k=1;k<arr.length;k++){
        int mul=1;
        if(o!=k){
        mul=arr[k]*arr[o];
        max=Math.max(max,mul);
    }
    }
        }
    return max;
    }
}