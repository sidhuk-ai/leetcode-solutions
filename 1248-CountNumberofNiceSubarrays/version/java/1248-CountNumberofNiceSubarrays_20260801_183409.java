// Last updated: 8/1/2026, 6:34:09 PM
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        return countAtMost(nums,k) - countAtMost(nums,k-1);
4    }
5    private int countAtMost(int[] nums, int k) {
6        int left = 0;
7        int atMost = 0;
8        int total = 0;
9        for(int right = 0; right < nums.length; right++) {
10            if(nums[right] % 2 != 0) atMost++;
11            while(atMost > k) {
12                if(nums[left]%2 != 0) atMost--;
13                left++;
14            }
15            total += (right - left + 1);
16        }
17        return total;
18    }
19}