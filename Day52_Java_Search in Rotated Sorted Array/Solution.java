class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0 || nums==null)
            return -1;
        if(nums.length==1 && nums[0]==target)
            return 0;
        if(nums.length==1 && nums[0]!=target)
            return -1;
        
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int middle = left + (right - left) / 2;

            if (nums[middle] > nums[right])
                left = middle + 1;
            
            else {
                right = middle;
            }
        }

        int pivot = left;
        left = 0;
        right = nums.length - 1;

        if (target >= nums[pivot] && target <= nums[right]) {
            left = pivot;
        } else {
            right = pivot;
        }
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
