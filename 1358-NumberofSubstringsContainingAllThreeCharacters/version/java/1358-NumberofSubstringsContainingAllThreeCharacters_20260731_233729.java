// Last updated: 7/31/2026, 11:37:29 PM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int[] arr = new int[3];
4
5        int count = 0;
6        int j = 0;
7        for(int i = 0; i < s.length(); i++){
8            arr[s.charAt(i)-'a']++;
9            while(arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {
10                count += s.length()-i;
11                arr[s.charAt(j)-'a']--;
12                j++;
13            }
14        }
15        return count;
16    }
17}