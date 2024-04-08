3106. Lexicographically Smallest String After Operations With Constraint

  class Solution {
    
    private static int minDistance(char s1, char p2) {
        int distance = Math.abs(s1 - p2);
        return Math.min(distance, 26 - distance);
    }
    
    public String getSmallestString(String s, int k) {
        char[] t = s.toCharArray();
        
        for (int i = 0; i < t.length; i++) {
            int dist = minDistance(t[i], 'a');
           
            if (dist <= k) {
                t[i] = 'a';
                k -= dist; 
            } else {
                int newCharDist = (t[i] - 'a' - k + 26) % 26;
                t[i] = (char)('a' + newCharDist);
                break; 
            }
        }
        
        return new String(t);
    }
}
