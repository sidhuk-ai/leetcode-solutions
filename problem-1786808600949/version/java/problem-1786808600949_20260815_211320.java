// Last updated: 8/15/2026, 9:13:20 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int jumpIdx = 0;
4        for(int i = 0; i < nums.length; i++) {
5            if(jumpIdx < i) return false;
6            jumpIdx = Math.max(jumpIdx, i+nums[i]);
7        }
8        return true;
9    }
10}