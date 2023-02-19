class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Set<String> a = new HashSet<String>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                List<Integer> list =new ArrayList<Integer>();
                int val=nums[i]+nums[j]+nums[k];
                if(val==0){
                    String str = nums[i] + ":" + nums[j] + ":" + nums[k];
                    if(!a.contains(str)){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        res.add(list);
                        a.add(str);
                    }
                    j++;
                    k--;
                }
                if(val<0)
                    j++;
                else if(val>0)
                    k--;          
            }
        }
        return res;
    }
}
