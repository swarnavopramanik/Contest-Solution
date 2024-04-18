https://www.codechef.com/problems/MKEQ

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] dp = new int[N];

            for (int j = 0; j < N; j++) {
                dp[j] = sc.nextInt();
            }

            String res = check(dp);
            System.out.println(res);
        }

        sc.close();
    }

    public static String check(int[] nums){
       // int s = nums.length();
        if (nums[0] == nums[nums.length - 1]) { 
            return "Yes";
        } else {
            int MakeEqual  = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                if (MakeEqual > nums[i]) {
                    return "NO";
                }
            }
            return "YES";
        }
	}
}
