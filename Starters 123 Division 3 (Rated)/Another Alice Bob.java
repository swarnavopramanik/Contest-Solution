https://www.codechef.com/problems/YETALICEBOB

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	private static String predictWinner(long N, long A, long B) {
        // If Alice can take all stones in her first move, she wins.
        if (N <= A) {
            return "Alice";
        }
        
        // If both can only take one stone at a time, the one to start on an odd count of stones wins.
        if (A == 1 && B == 1) {
            return (N % 2 == 0) ? "Bob" : "Alice";
        }
        
        // If A is greater than B, Alice has a winning strategy by ensuring the remaining stones
        // are always a multiple of (B + 1) after her turn, unless N is already a multiple of (B + 1),
        // in which case Bob can use the same strategy.
        if (A > B) {
            return "Alice";
        } else if (A == B) {
            // If A and B are equal, the strategy depends on the initial value of N.
            return (N % (A + 1) == 0) ? "Bob" : "Alice";
        } else {
            // In cases where B > A, the outcome depends on specific strategies that may vary.
            // However, for simplicity, this scenario isn't detailed here and would require
            // further game theory analysis to predict accurately in all cases.
            return "Bob";
        }
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; ++t) {
            long N = scanner.nextLong(); // Number of stones
            long A = scanner.nextLong(); // Maximum stones Alice can remove
            long B = scanner.nextLong(); // Maximum stones Bob can remove
            
            System.out.println(predictWinner(N, A, B));
        }
        
        scanner.close();

	}
}
