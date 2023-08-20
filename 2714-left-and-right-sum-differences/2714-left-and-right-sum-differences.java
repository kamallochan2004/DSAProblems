class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0, leftSum = 0;

        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        for(int i = 0; i < n; i++){
            int rightSum = sum - leftSum - nums[i];
            ans[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }

        return ans;
           }
         }
    