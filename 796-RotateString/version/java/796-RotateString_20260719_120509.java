// Last updated: 7/19/2026, 12:05:09 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length() != goal.length()) return false;
4
5        return (s+s).contains(goal);
6    }
7}