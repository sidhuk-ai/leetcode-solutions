// Last updated: 8/10/2026, 6:21:21 PM
1class Solution {
2    public int beautySum(String s) {
3        int count = 0;
4        for(int i = 0; i < s.length(); i++) {
5            HashMap<Character, Integer> map = new HashMap<>();
6            for(int j = i; j < s.length(); j++) {
7                map.put(s.charAt(j),map.getOrDefault(s.charAt(j), 0)+1);
8
9                int max = Integer.MIN_VALUE;
10                int min = Integer.MAX_VALUE;
11
12                for(int value: map.values()) {
13                    max = Math.max(max, value);
14                    min = Math.min(min, value);
15                }
16
17                count += (max-min);
18            }
19        }
20        return count;
21    }
22}