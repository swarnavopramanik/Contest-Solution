3068. Find the Maximum Sum of Node Values

  
  class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
          int n = nums.length;
        List<List<Integer>> lis = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lis.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            lis.get(edges[i][0]).add(edges[i][1]);
            lis.get(edges[i][1]).add(edges[i][0]);
        }
        
        List<Integer> inc = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long val = (long) nums[i] ^ k;
            if (val > nums[i]) {
                inc.add(i);
            }
        }
        
        int sz = inc.size();
        if (sz % 2 == 0) {
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += nums[i];
            }
            for (int i : inc) {
                ans -= nums[i];
                long add = (long) nums[i] ^ k;
                ans += add;
            }
            return ans;
        } else {
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += (long) nums[i];
            }
            long hue = ans;
            
            for (int i : inc) {
                ans -= nums[i];
                long add = (long) nums[i] ^ k;
                ans += add;
            }
            for (int i = 0; i < sz; i++) {
                long add = (long) nums[inc.get(i)] ^ k;
                long currAns = ans - add + nums[inc.get(i)];
                hue = Math.max(hue, currAns);
            }
            
            List<Integer> vis = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                vis.add(0);
            }
            long sum = 0;
            for (int i : inc) {
                vis.set(i, 1);
            }
            for (int i = 0; i < n; i++) {
                if (vis.get(i) == 0) {
                    long add = (long) nums[i] ^ k;
                    long currAns = ans - nums[i] + add;
                    hue = Math.max(hue, currAns);
                }
            }
            
            return hue;
        }
    }
} 

class Solution {
        public long maximumValueSum(int[] A, int k, int[][] edges) {
        long res = 0;
        int d = 1 << 30, c = 0;
        for (int a : A) {
            int b = a ^ k;
            res += Math.max(a, b);
            c ^= a < b ? 1 : 0;
            d = Math.min(d, Math.abs(a - b));
        }
        return res - d * c;
    }
}
