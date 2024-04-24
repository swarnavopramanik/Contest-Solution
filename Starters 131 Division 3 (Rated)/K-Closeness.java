https://www.codechef.com/START131C/problems/KCLOSE


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 1; c <= t; c++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long maxval = a[n - 1];
            for (int i = 0; i < n - 1; i++) {
                long tmp = (maxval - a[i]) / k;
                a[i] = a[i] + (tmp * k);
            }
            long minval = a[n - 1];
            for (long val : a) {
                minval = Math.min(minval, val);
            }
            long ans1 = maxval - minval;
            Arrays.sort(a);
            maxval = a[n - 1];
            for (int i = 0; i < n; i++) {
                ans1 = Math.min(ans1, maxval - a[i]);
                maxval = Math.max(maxval, a[i] + k);
            }
            System.out.println(ans1);
        }
        sc.close();

	}
}
