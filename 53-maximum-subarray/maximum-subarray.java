class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxi=nums[0];
        int maxSum=0;
        for(int i=0;i<n;i++){
            maxSum=maxSum+nums[i];
            maxi=Math.max(maxi,maxSum);


            if(maxSum<0){
                maxSum=0;
            }
        }
        return maxi;
    }
}