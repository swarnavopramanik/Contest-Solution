https://www.codechef.com/problems/MAXADJSUM

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

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // Size of the array

            int total = 0;
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            for (int j = 0; j < N; j++) {
                int element = scanner.nextInt(); // Read an element

                if (element < min1) {
                    min2 = min1;
                    min1 = element;
                } else if (element < min2) {
                    min2 = element;
                }

                total += element; // Add element to the total sum
            }

            int maxSum = (2 * total) - min1 - min2; // Calculate the maximum sum
            System.out.println(maxSum);
        }

        scanner.close();

	}
}
