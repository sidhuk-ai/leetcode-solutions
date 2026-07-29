// Last updated: 7/29/2026, 6:09:10 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int left = 0;
4        int right = 0;
5        boolean[] visited = new boolean[256];
6        int longest = 0;
7        while(right < s.length() && left < s.length() && left <= right) {
8            while(visited[s.charAt(right)]) {
9                visited[s.charAt(left)] = false;
10                left++;
11            }
12            visited[s.charAt(right)] = true;
13            longest = Math.max(longest, right-left+1);
14            right++;
15        }
16        return longest;
17    }
18}