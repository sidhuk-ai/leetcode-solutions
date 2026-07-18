// Last updated: 7/18/2026, 10:48:35 AM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs == null || strs.length == 0) return "";
4
5        StringBuilder sb = new StringBuilder();
6        Arrays.sort(strs);
7
8        String start = strs[0];
9        String last = strs[strs.length - 1];
10
11        for(int i = 0; i < Math.min(start.length(),last.length()); i++) {
12            if(start.charAt(i) != last.charAt(i)) return sb.toString();
13            sb.append(start.charAt(i));
14        }
15        return sb.toString();
16    }
17}