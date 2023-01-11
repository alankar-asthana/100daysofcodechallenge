class Solution {
    public int removeElement(int[] nums, int val) {
        int size=nums.length;
        if(size==0)
            return size;

        int j=size-1;
        int k=0;
        for(int i=0;i<size;i++){
            if(i==size-1&&nums[i]==val){
                k++;
                return (size-k);
            }
            if(nums[i]==val){
                
                //outer:
                while(j>=0){
                    if(nums[j]!=val){
                        nums[i]=nums[j];
                        break;
                    }
                    j--;
                }
                j--;
                k++;
            }
        }
        for(int a:nums){
            System.out.print(a+" ");
        }
        return (size-k);
    }
}
