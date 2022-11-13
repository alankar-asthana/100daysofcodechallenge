class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int arr[]=new int[len1+len2];
        System.arraycopy(nums1,0,arr,0,len1);
        System.arraycopy(nums2,0,arr,len1,len2);
        Arrays.sort(arr,0,(len1+len2));
        int index=(len1+len2)/2;
        double median;
        if(arr.length%2==0){
            median=(arr[index-1]+arr[index])/2.0;
        }
        else{median =arr[index];}
        return median;
    }
}
