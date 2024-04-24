https://www.codechef.com/START131C/problems/DIDE

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();  
            int K = sc.nextInt();  
            int[] A = new int[N];
            
            int sum = 0;
            PriorityQueue<Integer> gains = new PriorityQueue<>();
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
                
                int flip = 7 - A[i]; 
                int gain = flip - A[i];
                if (gain > 0) {
                    gains.add(-gain);
                }
            }
            
            
            while (K-- > 0 && !gains.isEmpty()) {
                int maxGain = -gains.poll();
                if (maxGain > 0) {
                    sum += maxGain;
                }
            }
            
            System.out.println(sum);
        }
        
        sc.close();

	}
}
