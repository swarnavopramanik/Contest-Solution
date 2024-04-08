
3105. Longest Strictly Increasing or Strictly Decreasing Subarray

  class Solution {
    public int longestMonotonicSubarray(int[] nums) {
         if (nums.length <= 1) 
             return nums.length;
        
        int inc = 1, dec = 1, maxLength = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                inc++;
                dec = 1;
            } else if (nums[i] < nums[i-1]) {
                dec++;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            
            maxLength = Math.max(maxLength, Math.max(inc, dec));
        }
        
        return maxLength;
    }
}
