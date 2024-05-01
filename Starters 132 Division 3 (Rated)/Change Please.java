https://www.codechef.com/START132C/problems/CHANGE_PLZ

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt(); 
            int change = 100 - X; 

            
            int max = change / 10;

    
            int pay = Math.min(change, max * 10);

            System.out.println(pay); 
        }

        scanner.close();

	}
}
