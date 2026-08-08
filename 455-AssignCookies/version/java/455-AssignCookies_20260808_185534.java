// Last updated: 8/8/2026, 6:55:34 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5
6        int childPointer = 0, cookiePointer = 0;
7        int count = 0;
8
9        while(childPointer < g.length && cookiePointer < s.length) {
10            if(s[cookiePointer] >= g[childPointer]) {
11                childPointer++;
12            }
13            cookiePointer++;
14        }
15        return childPointer;
16    }
17}