// Last updated: 7/17/2026, 9:54:44 AM
// revision
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder sb = new StringBuilder();
4        int level = 0;
5
6        for(int i = 0; i < s.length(); i++) {
7            if(s.charAt(i) == '(') {
8                if(level > 0) sb.append(s.charAt(i));
9                level++;
10            } else {
11                level--;
12                if(level > 0) sb.append(s.charAt(i));
13            }
14        }
15        return sb.toString();
16    }
17}