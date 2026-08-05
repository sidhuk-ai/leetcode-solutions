// Last updated: 8/6/2026, 12:58:32 AM
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return countAtMost(nums,k) - countAtMost(nums,k-1);
4    }
5    private int countAtMost(int[] nums, int k) {
6        HashMap<Integer,Integer> map = new HashMap<>();
7        int left = 0;
8        int count = 0;
9        for(int right = 0; right < nums.length; right++) {
10            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
11            if(map.get(nums[right]) == 1) k--;
12
13            while(k < 0) {
14                map.put(nums[left], map.getOrDefault(nums[left], 0)-1);
15                if(map.get(nums[left]) == 0) k++;
16                left++;
17            }
18
19            count += (right-left+1);
20        }
21        return count;
22    }
23}