// Last updated: 8/20/2026, 10:37:14 PM
1class Solution {
2    public int jump(int[] nums) {
3        int minSteps = 0;
4        int left = 0, right = 0;
5
6        while(right < nums.length-1) {
7            int farthest = 0;
8            for(int i = left; i <= right; i++) {
9                farthest = Math.max(i+nums[i],farthest);
10            }
11            left = right+1;
12            right = farthest;
13            minSteps++;
14        }
15        return minSteps;
16    }
17}