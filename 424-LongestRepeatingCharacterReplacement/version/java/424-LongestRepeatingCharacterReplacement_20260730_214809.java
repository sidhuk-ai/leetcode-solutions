// Last updated: 7/30/2026, 9:48:09 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] alpha = new int[26];
4        int left = 0, right = 0;
5        int maxLength = 0;
6        int maxCount = 0;
7        while(right < s.length()) {
8            alpha[s.charAt(right)-'A']++;
9            maxCount = Math.max(maxCount, alpha[s.charAt(right)-'A']);
10
11            while((right-left+1)-maxCount > k) {
12                alpha[s.charAt(left)-'A']--;
13                left++;
14            }
15
16            maxLength = Math.max(maxLength, right-left+1);
17            right++;
18        }
19        return maxLength;
20    }
21}