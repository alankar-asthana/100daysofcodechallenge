class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int maxsum=nums[0];

        for(int i=1;i<nums.length;i++){
            maxsum=Math.max((maxsum+nums[i]),nums[i]);
            res=Math.max(res,maxsum);
        }
        return res;
    }
}
