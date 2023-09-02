class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxCount=nums.length>>1;
        int count=1;
        for(int i=1;i<=nums.length;i++){
            if(count>maxCount){
                return nums[i-1];
            }
            if(i<nums.length){
                if(nums[i-1]==nums[i]){
                    count++;
                }
                else if(nums[i-1]!=nums[i]){
                    count=1;
                }
            }
             }
             return count;
     }
 }
