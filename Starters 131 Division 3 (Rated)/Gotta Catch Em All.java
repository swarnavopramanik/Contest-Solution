https://www.codechef.com/START131C/problems/GCEA

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
            int X = sc.nextInt(); 
            int Y = sc.nextInt();  
            long minCoins = 0;

            for (int j = 0; j < N; j++) {
                int A = sc.nextInt();  
                minCoins += Math.min((long) A * X, Y);
            }

            System.out.println(minCoins);
        }

        sc.close();

	}
}
