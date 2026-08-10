// Last updated: 8/11/2026, 12:01:34 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int maxLength = 0;
4        boolean[] vis = new boolean[256];
5        Arrays.fill(vis, false);
6        int left = 0;
7        for(int right = 0; right < s.length(); right++) {
8            while(vis[s.charAt(right)]) {
9                vis[s.charAt(left)] = false;
10                left++;
11            }
12
13            vis[s.charAt(right)] = true;
14            maxLength = Math.max(maxLength, right-left+1);
15        }
16        return maxLength;
17    }
18}