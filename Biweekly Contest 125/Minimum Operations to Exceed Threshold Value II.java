
3066. Minimum Operations to Exceed Threshold Value II

  class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        boolean allElementsValid = true;     
        for (int num : nums) {
            if (num < k) {
                allElementsValid = false;
            }
            pq.add((long) num);
        }   
        if (allElementsValid) {
            return 0;
        }   
        int operations = 0;
        while (pq.size() > 1 && pq.peek() < k) {
            long first = pq.poll(); 
            long second = pq.poll();     
            long newElement = first * 2 + second;
            pq.add(newElement);
            operations++;
        }
        /* return pq.peek() >= k ? operations : -1;  */
        return operations;
    }
}
