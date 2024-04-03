https://codeforces.com/contest/1942/problem/A

import java.util.Scanner;
 
public class MyClass {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            if (n == k) {
                for (long i = 0; i < n; i++) {
                    System.out.print("1 ");
                }
                System.out.println();
            } else if (k == 1) {
                for (long i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
    }
}
