class Solution {
    public int findLucky(int[] arr) {
        int []freq =new int[501];
        for(int val: arr){
            freq[val]++;
        }
        for(int i=freq.length-1;i>0;i--){
            if(i==freq[i]){
                return i;
            }
        }
        return -1;
    }
}