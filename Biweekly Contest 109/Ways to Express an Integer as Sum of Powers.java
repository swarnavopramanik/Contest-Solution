https://leetcode.com/contest/biweekly-contest-109/problems/ways-to-express-an-integer-as-sum-of-powers/

class Solution {
    public int numberOfWays(int n, int x) {
        long[] dp = new long[n+1];
        int mod = 1000000007;
        dp[0] = 1;
        for(int i = 1;i <= n;i++){
            int j = (int)Math.pow(i, x);
            if(j > n)break;
            for(int k = n-j;k >= 0;k--){
                dp[k+j] += dp[k];
                dp[k+j] %= mod;
            }
        }
        return (int)(dp[n] % mod);
    }
}
