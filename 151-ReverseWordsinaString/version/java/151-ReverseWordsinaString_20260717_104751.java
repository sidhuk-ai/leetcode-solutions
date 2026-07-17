// Last updated: 7/17/2026, 10:47:51 AM
1class Solution {
2    public String reverseWords(String s) {
3        StringBuilder sb = new StringBuilder();
4
5        int end = s.length()-1;
6        // int startingPoint = -1;
7        int endingPoint = -1;
8        while(end >= 0) {
9            // System.out.println("End pointer: "+end);
10            while(end >= 0 && s.charAt(end) == ' ') end--;
11            endingPoint = end;
12            
13            if(end < 0) break;
14
15            while(end >= 0 && s.charAt(end) != ' ') end--;
16
17            if(sb.length() != 0) {
18                sb.append(" ");
19            }
20            sb.append(s.substring(end+1,endingPoint+1));
21        }
22        return sb.toString();
23    }
24}