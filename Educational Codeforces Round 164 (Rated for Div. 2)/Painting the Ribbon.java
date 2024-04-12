https://codeforces.com/contest/1954/problem/A

import java.util.Scanner;

public class MyClass {
       public static void PaintingRibbon(int i, int j, int k) {
        if (i - (i / j + (i % j != 0 ? 1 : 0)) <= k)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  

        while (T-- > 0) {
            int i = sc.nextInt(); 
            int j = sc.nextInt(); 
            int k = sc.nextInt(); 

            PaintingRibbon(i, j, k);
        }

        sc.close();
    }
}
