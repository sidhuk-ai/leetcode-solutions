// Last updated: 7/18/2026, 11:11:01 AM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        int[] m1 = new int[256];
4        int[] m2 = new int[256];
5
6        for(int i = 0; i < s.length(); i++) {
7            if(m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
8            m1[s.charAt(i)] = i+1;
9            m2[t.charAt(i)] = i+1;
10        }
11        return true;
12    }
13}