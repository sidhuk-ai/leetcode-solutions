// Last updated: 8/10/2026, 7:15:56 PM
1class Solution {
2    public String reverseWords(String s) {
3        int pointer = s.length()-1;
4        StringBuilder sb = new StringBuilder();
5        while(pointer >= 0) {
6            while(pointer >= 0 && s.charAt(pointer) == ' ') pointer--;
7            if(pointer < 0) break;
8            int temp = pointer;
9            while(pointer >= 0 && s.charAt(pointer) != ' ') pointer--;
10
11            if(!sb.isEmpty()) sb.append(" ");
12            sb.append(s.substring(pointer+1,temp+1));
13        }
14        return sb.toString();
15    }
16}