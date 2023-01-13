class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] returnar=new int[2];

        int first=-1,last=-1;
        outer:
        for(int i=0;i<nums.length;i++){
           if (nums[i]!=target)
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        returnar[0]=first;
        returnar[1]=last;

        return returnar;
    }
}
