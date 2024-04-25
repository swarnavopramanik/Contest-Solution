https://www.codechef.com/problems/CHECKADJSUM

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        long test = scanner.nextLong();
        
        while (test-- > 0) {
            solve(scanner);

	}
}

private static void solve(Scanner scanner) {
        long n = scanner.nextLong();
        long q = scanner.nextLong();
        long sum = 0;
        long[] v = new long[(int)n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextLong();
            sum += v[i];
        }

        while (q-- > 0) {
            long x = scanner.nextLong();
            int check = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    long temp = sum - v[i] - v[j];
                    temp = temp * 2;
                    temp = temp + v[i] + v[j];
                    if (temp == x) {
                        System.out.print(v[i] + " ");
                        for (int k = 0; k < n; k++) {
                            if (k != i && k != j) {
                                System.out.print(v[k] + " ");
                            }
                        }
                        System.out.println(v[j]);
                        check = 1;
                        break;
                    }
                }
                if (check == 1) {
                    break;
                }
            }
            if (check == 0) {
                System.out.println(-1);
            }
        }
    }
}
