// Last updated: 7/27/2026, 11:00:56 PM
1class Solution {
2    public String reverseWords(String s) {
3        StringBuilder sb = new StringBuilder();
4        int pointer = s.length()-1;
5        while(pointer >= 0) {
6            // System.out.println(pointer);
7            while(pointer >= 0 && s.charAt(pointer) == ' ') pointer--;
8            if(pointer < 0) break;
9            int endPointer = pointer;
10            while(pointer >= 0 && s.charAt(pointer) != ' ') pointer--;
11            if(!sb.isEmpty()) sb.append(" ");
12            sb.append(s.substring(pointer+1,endPointer+1));
13        }
14        return sb.toString();
15    }
16}