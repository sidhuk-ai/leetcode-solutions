// Last updated: 8/8/2026, 6:57:04 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int childPointer = 0, cookiePointer = 0;
6
7        while(childPointer < g.length && cookiePointer < s.length) {
8            if(s[cookiePointer] >= g[childPointer]) {
9                childPointer++;
10            }
11            cookiePointer++;
12        }
13        return childPointer;
14    }
15}