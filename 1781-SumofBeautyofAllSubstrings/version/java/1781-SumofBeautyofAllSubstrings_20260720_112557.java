// Last updated: 7/20/2026, 11:25:57 AM
1class Solution {
2    public int beautySum(String s) {
3        int res = 0;
4
5        for(int i = 0; i < s.length(); i++) {
6            HashMap<Character, Integer> map = new HashMap<>();
7            for(int j = i; j < s.length(); j++) {
8                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
9
10                int max = Integer.MIN_VALUE;
11                int min = Integer.MAX_VALUE;
12
13                for(int value: map.values()) {
14                    max = Math.max(max,value);
15                    min = Math.min(min,value);
16                }
17                res += (max-min);
18            }
19        }
20        return res;
21    }
22}