https://www.codechef.com/problems/MINANDMAX

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static long minValueOfF(int N) {
        if (N % 2 == 0) {
            return ((long) N / 2) * ((long) N / 2 + 1);
        } else {
            return ((long) N / 2 + 1) * ((long) N / 2 + 1);
        }
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		 Scanner scanner = new Scanner(System.in);

        // Input number of test cases
        int T = scanner.nextInt();

        // Iterate through each test case
        for (int i = 0; i < T; ++i) {
            // Input size of the permutation
            int N = scanner.nextInt();
            
            // Output the minimum value of f(A)
            System.out.println(minValueOfF(N));
        }

        scanner.close();

	}
}
