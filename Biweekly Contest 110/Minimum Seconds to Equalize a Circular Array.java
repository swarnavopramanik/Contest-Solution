2808. Minimum Seconds to Equalize a Circular Array

  class Solution {
    private int n;
    public int minimumSeconds(List<Integer> nums) {
        n = nums.size();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            add(map, nums.get(i), i);
        }
        
        int res = Integer.MAX_VALUE;
        for (List<Integer> list: map.values()) res = Math.min(res, time(list));
        return res;
    }
    
    private void add(Map<Integer, List<Integer>> map, int k, int idx) {
        List<Integer> list = map.getOrDefault(k, new ArrayList<>());
        list.add(idx);
        map.put(k, list);
    }
    
    private int time(List<Integer> list) {
        int sz = list.size();
        int gap = 0;
        if (list.size() == 1) {
            gap = n - 1;
        } else {
            for (int i = 1; i < list.size(); i++) {
                gap = Math.max(gap, list.get(i) - list.get(i - 1) - 1);
            }
            gap = Math.max(gap, list.get(0) + n - list.get(sz - 1) - 1);
        }
        return (gap + 1) / 2;
    }
}
