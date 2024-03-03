3065. Minimum Operations to Exceed Threshold Value I

  class Solution {
    public int minOperations(int[] nums, int k) {
         Arrays.sort(nums);
        int operations = 0;
    
        for (int num : nums) {
            
            if (num >= k) {
                break;
            }
           
            operations++;
        }
        
        return operations;
    }
}

https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/
