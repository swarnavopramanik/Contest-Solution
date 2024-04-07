https://codeforces.com/contest/1951/problem/C

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
 
public class MyClass {
       public static long minSpending(int n, int m, int k, int[] prices) {
        Arrays.sort(prices);
        long totalCost = 0;
        long ticketsBought = 0;
        PriorityQueue<Integer> priceIncreases = new PriorityQueue<>();
 
        for (int i = 0; i < n && ticketsBought < k; i++) {
            long buy = Math.min(m, k - ticketsBought); 
            long priceIncrease = 0;
            if (!priceIncreases.isEmpty()) {
                priceIncrease = priceIncreases.poll();
            }
 
            totalCost += (prices[i] + priceIncrease) * buy;
            ticketsBought += buy;
 
        
            priceIncreases.add((int) (buy + priceIncrease));
        }
 
        return totalCost;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
 
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) {
                prices[i] = scanner.nextInt();
            }
 
            System.out.println(minSpending(n, m, k, prices));
        }
 
        scanner.close();
    }
}
