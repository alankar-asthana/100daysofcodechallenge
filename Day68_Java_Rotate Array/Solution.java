//Solution1(iterative solution):

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n=nums.length;
//         for(int i=0;i<k;i++){
//             int temp=nums[n-1];
//             for(int j=n-1;j>=1;j--){
//                 nums[j]=nums[j-1];
//             }
//             nums[0]=temp;
//         }
//     }
// }

//Solution2(recursive solution):

class Solution{
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
