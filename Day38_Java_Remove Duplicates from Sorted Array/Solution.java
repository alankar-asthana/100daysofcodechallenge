class Solution {
    public int removeDuplicates(int[] nums) {
        //int start=nums[0];

        int size=nums.length;
        if(size==0||size==1){
            return size;
        }
        int k=0;
        for(int i=0;i<size-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[k++]=nums[i];
            }
        }
        nums[k++]=nums[size-1];

        return k;
    }
}
