// Last updated: 8/1/2026, 3:42:07 PM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int[] arr = new int[3];
4        int left = 0;
5        int count = 0;
6        for(int right = 0; right < s.length(); right++) {
7            arr[s.charAt(right)-'a']++;
8            while(arr[0] >= 1 && arr[1] >= 1 && arr[2] >= 1) {
9                count += (s.length()-right);
10                arr[s.charAt(left)-'a']--;
11                left++;
12            }
13        }
14        return count;
15    }
16}