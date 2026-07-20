// Last updated: 7/20/2026, 11:16:14 AM
1class Solution {
2    private int beauty(String s) {
3        int[] arr = new int[26];
4        int highest = Integer.MIN_VALUE;
5        int lowest = Integer.MAX_VALUE;
6        for (int i = 0; i < s.length(); i++) {
7            arr[s.charAt(i) - 'a']++;
8        }
9        for (int i = 0; i < s.length(); i++) {
10            highest = Math.max(highest, arr[s.charAt(i) - 'a']);
11            lowest = Math.min(lowest, arr[s.charAt(i) - 'a']);
12        }
13        // System.out.println(s + "-->" + highest+" "+lowest);
14        if (highest == Integer.MIN_VALUE && lowest == Integer.MAX_VALUE)
15            return 0;
16        return (highest - lowest);
17    }
18
19    public int beautySum(String s) {
20        int start = 0;
21        int end = 0;
22        int res = 0;
23
24        for (int i = 0; i < s.length(); i++) {
25            for (int j = i; j < s.length(); j++) {
26                int beautyNum = beauty(s.substring(i, j+1));
27                res += beautyNum;
28            }
29        }
30        return res;
31    }
32}