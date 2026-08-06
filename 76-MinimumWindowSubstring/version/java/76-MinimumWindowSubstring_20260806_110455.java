// Last updated: 8/6/2026, 11:04:55 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        if(t.length() > s.length()) return "";
4        Map<Character, Integer> map = new HashMap<>();
5        int n = t.length();
6        int m = s.length();
7        for(int i = 0; i < n; i++) {
8            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
9        }
10        // System.out.println(map);
11        int required = map.size();
12        int minLength = Integer.MAX_VALUE;
13        int minLeft = 0;
14        int left = 0, right = 0;
15        int formed = 0;
16        Map<Character, Integer> counter = new HashMap<>();
17        while(right < m) {
18            char ch = s.charAt(right);
19            counter.put(ch, counter.getOrDefault(ch, 0)+1);
20            if(map.containsKey(ch) && map.get(ch).intValue() == counter.get(ch).intValue()) formed++;
21
22            while(left <= right && formed == required) {
23                if((right-left+1) < minLength) {
24                    minLength = right-left+1;
25                    minLeft = left;
26                }
27                counter.put(s.charAt(left), counter.getOrDefault(s.charAt(left), 0)-1);
28
29                if(map.containsKey(s.charAt(left)) && counter.get(s.charAt(left)) < map.get(s.charAt(left))) formed--;
30
31                left++;
32            }
33            right++;
34        }
35
36        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft+minLength);
37    }
38}