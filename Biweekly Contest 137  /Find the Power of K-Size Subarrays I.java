You are given an array of integers nums of length n and a positive integer k.

The power of an array is defined as:

Its maximum element if all of its elements are consecutive and sorted in ascending order.
-1 otherwise.
You need to find the power of all 
subarrays
 of nums of size k.

Return an integer array results of size n - k + 1, where results[i] is the power of nums[i..(i + k - 1)].

 

Example 1:

Input: nums = [1,2,3,4,3,2,5], k = 3

Output: [3,4,-1,-1,-1]

Explanation:

There are 5 subarrays of nums of size 3:

[1, 2, 3] with the maximum element 3.
[2, 3, 4] with the maximum element 4.
[3, 4, 3] whose elements are not consecutive.
[4, 3, 2] whose elements are not sorted.
[3, 2, 5] whose elements are not consecutive.

 // Code
 
  class Solution {
    public int[] resultsArray(int[] nums, int k) {
     List<Integer> results = new ArrayList<>();


    for (int i = 0; i <= nums.length - k; i++) {
        boolean isValid = true;

        for (int j = i + 1; j < i + k; j++) {
            if (nums[j] != nums[j - 1] + 1) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            results.add(nums[i + k - 1]); 
        } else {
            results.add(-1);
        }
    }

    int[] resultArray = new int[results.size()];
    for (int i = 0; i < results.size(); i++) {
    resultArray[i] = results.get(i);
    }

    return resultArray;

    }

}
