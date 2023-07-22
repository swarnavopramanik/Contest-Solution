https://leetcode.com/contest/biweekly-contest-109/problems/sort-vowels-in-a-string/


class Solution {
    public String sortVowels(String S) {
        char[] s = S.toCharArray();
        int[] f = new int[128];
        for(char c : s){
            f[c]++;
        }
        String X = "AEIOUaeiou";
        for(int i = 0;i < s.length;i++){
            if(X.indexOf(s[i]) >= 0){
                for(char t : X.toCharArray()){
                    if(f[t] > 0){
                        f[t]--;
                        s[i] = t;
                        break;
                    }
                }
            }
        }
        return new String(s);
    }
}
