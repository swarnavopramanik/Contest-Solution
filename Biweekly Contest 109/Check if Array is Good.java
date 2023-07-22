https://leetcode.com/contest/biweekly-contest-109/problems/check-if-array-is-good/

class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        nums[n-1]++;
        for(int i = 0;i < n;i++){
            if(nums[i] != i+1)return false;
        }
        return true;
    }
}
