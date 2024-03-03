3067. Count Pairs of Connectable Servers in a Weighted Tree Network

  import java.util.ArrayList;
import java.util.List;

class Solution {
    List<int[]>[] adj;
    int mod;

    int dfs(List<int[]>[] adj, int par, int n, int s) {
        int ans = 0;
        if (s % mod == 0)
            ans++;
        for (int[] i : adj[n]) {
            if (i[0] == par)
                continue;
            ans = ans + dfs(adj, n, i[0], s + i[1]);
        }
        return ans;
    }

    int cal(List<int[]>[] adj, int n) {
        int prev = 0;
        int ans = 0;
        for (int[] i : adj[n]) {
            int k = dfs(adj, n, i[0], i[1]);
            ans = ans + prev * k;
            prev = prev + k;
        }
        return ans;
    }

    public List<Integer> countPairsOfConnectableServers(List<List<Integer>> v, int k) {
        int n = v.size();
        adj = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (List<Integer> edge : v) {
            adj[edge.get(0)].add(new int[]{edge.get(1), edge.get(2)});
            adj[edge.get(1)].add(new int[]{edge.get(0), edge.get(2)});
        }

        List<Integer> ans = new ArrayList<>();
        mod = k;
        for (int i = 0; i <= n; i++) {
            int m = adj[i].size();
            int s = cal(adj, i);
            ans.add(s);
        }
        return ans;
    }
}
