https://codeforces.com/contest/1954/problem/B

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyClass {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        while (T --> 0) {
            int n = sc.nextInt(); 
            int[] dp = new int[n];
            HashMap<Integer, Integer> hm = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                dp[i] = x;
                hm.put(x, hm.getOrDefault(x, 0) + 1);
            }

            if (hm.size() == 1) { // If all elements are the same
                System.out.println(-1);
                continue;
            }

            int s = dp[0];
            int p = 0;
            int answer = n;

            for (int i = 0; i < n; i++) {
                if (dp[i] == s) {
                    p++;
                } else {
                    answer = Math.min(answer, p);
                    p = 0;
                }
            }
            answer = Math.min(answer, p);

            System.out.println(answer);
        }

        sc.close();
    }
}
