https://codeforces.com/contest/1951/problem/A

import java.util.Scanner;
 
public class MyClass {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
 
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
 
            int count = 0;
            boolean sec = false;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    count++;
                }
            }
 
            for (int i = 0; i < N - 1; i++) { // Note: Check until n - 2 to avoid IndexOutOfBoundsException
                if (S.charAt(i) == '1' && S.charAt(i + 1) == '1') {
                    sec = true;
                }
            }
 
            if (count % 2 == 1 || (count == 2 && sec)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
