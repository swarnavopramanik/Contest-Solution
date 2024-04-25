https://www.codechef.com/problems/ROOMALLOC


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
            int N = scanner.nextInt(); // Number of colleges

            int totalRooms = 0;
            for (int j = 0; j < N; j++) {
                int students = scanner.nextInt(); // Number of people from each college
                // Calculate rooms needed for this college. Add 1 before dividing by 2 to round up for odd numbers.
                totalRooms += (students + 1) / 2;
            }

            System.out.println(totalRooms);
        }

        scanner.close();

	}
}
