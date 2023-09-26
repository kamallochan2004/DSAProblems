class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0;
        int minSoFar=prices[0];
        for(int i=0;i<prices.length;i++){
            minSoFar=Math.min(minSoFar,prices[i]);
            int profit=prices[i]-minSoFar;
            maxpro=Math.max(maxpro,profit);
        }
        return maxpro;
    }
}