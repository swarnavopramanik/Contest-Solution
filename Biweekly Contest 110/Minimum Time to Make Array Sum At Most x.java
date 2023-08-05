2809. Minimum Time to Make Array Sum At Most x

  class Solution {
    public int minimumTime(List<Integer> nums1, List<Integer> nums2, int x) {
        int n = nums1.size();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums1.get(i);
            arr[i][1] = nums2.get(i);
        }
        
        Arrays.sort(arr, (o1, o2) -> o1[1] - o2[1]);
        
        long[][] dp = new long[n][n];
        dp[0][0] = arr[0][0] + arr[0][1];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], arr[i][0] + arr[i][1]);
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1] + arr[i][0] + arr[i][1] * (j + 1));
            }
        }
        
        long sum1 = sum(nums1);
        long sum2 = sum(nums2);
        if (sum1 <= x) return 0;
        for (int i = 1; i <= n; i++) {
            if (sum1 + sum2 * i - dp[n - 1][i - 1] <= x) return i;
        }
        return -1;
    }
    
    private int sum(List<Integer> arr) {
        int res = 0;
        for (int num: arr) res += num;
        return res;
    }
}
