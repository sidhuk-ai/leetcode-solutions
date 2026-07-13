// Last updated: 7/13/2026, 11:03:56 PM
1class Solution {
2    public String largestOddNumber(String num) {
3        for(int i = num.length()-1; i >= 0; i--) {
4            int oddNum = num.charAt(i)-'0';
5            if(oddNum%2 != 0) {
6                return num.substring(0,i+1);
7            }
8        }
9        return "";
10    }
11}