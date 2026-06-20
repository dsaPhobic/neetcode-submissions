class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if(nums.length==0) return 0;
        int res = -9999;
        for(int i : nums){
            set.add(i);
        }
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i]-1)) continue;
            else {
                int tmp = 1;
                int start = nums[i];
                while(set.contains(start+1)){
                    tmp++;
                    start++;
                }
                res = Math.max(res,tmp);
            }
        }
    return res;
        
    }
}
