https://www.codechef.com/problems/MINANDMAX2

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            long N = scanner.nextLong(); // Size of the permutation

            // Optimized calculation of the minimum value of f(A)
            long minSum = ((N * (N + 1)) / 2) + (N - 1);

            System.out.println(minSum);
        }

        scanner.close();;

	}
}
