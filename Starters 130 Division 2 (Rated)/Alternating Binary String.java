https://www.codechef.com/problems/ALBS

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T -- > 0) {
            int N = sc.nexInt();
            String S = sc.next();
            int C = 0;
            for (int j = 1; j < N; j++) {
                if (S.charAt(j-1) ==  S.charAt(j)) {
                    C++;
                }
            }
            System.out.println(C);
        }

	}
}
