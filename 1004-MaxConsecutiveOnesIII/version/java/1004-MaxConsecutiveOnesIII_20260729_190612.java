// Last updated: 7/29/2026, 7:06:12 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int maxLength = 0;
4        int left = 0;
5        int zerosCount = 0;
6
7        for(int right = 0; right < nums.length; right++) {
8            if(nums[right] == 0) {
9                zerosCount++;
10            }
11            if(zerosCount > k) {
12                if(nums[left] == 0) zerosCount--;
13                left++;
14            }
15            maxLength = Math.max(maxLength, right-left+1);
16        }
17        return maxLength;
18    }
19}