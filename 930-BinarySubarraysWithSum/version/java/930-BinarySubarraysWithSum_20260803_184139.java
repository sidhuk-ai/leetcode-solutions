// Last updated: 8/3/2026, 6:41:39 PM
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        // System.out.println(atMost(nums,goal)+" "+atMost(nums,goal-1));
4        return atMost(nums,goal) - atMost(nums,goal-1);
5    }
6    private int atMost(int[] nums, int goal) {
7        if(goal<0) return 0;
8        int sum = 0;
9        int left = 0;
10        int count = 0;
11        for(int right = 0; right < nums.length; right++) {
12            sum += nums[right];
13            while(sum > goal) {
14                sum -= nums[left];
15                left++;
16            }
17            count += (right-left+1);
18        }
19        return count;
20    }
21}