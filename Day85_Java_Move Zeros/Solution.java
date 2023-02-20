class Solution {
    public void moveZeroes(int[] nums) {
        int size=nums.length;
        int j=0;
        int temp=0;
        for(int i=0;i<size;i++){
            if(nums[i]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}
