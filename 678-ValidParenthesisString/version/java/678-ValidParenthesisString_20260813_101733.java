// Last updated: 8/13/2026, 10:17:33 AM
1class Solution {
2    public boolean checkValidString(String s) {
3        int minOpen = 0, maxOpen = 0;
4
5        for(int i = 0; i < s.length(); i++) {
6            if(s.charAt(i) == '(') {
7                minOpen++;
8                maxOpen++;
9            }
10            else if(s.charAt(i) == ')') {
11                minOpen--;
12                maxOpen--;
13            }
14            else {
15                minOpen--;
16                maxOpen++;
17            }
18
19            if(maxOpen < 0) return false;
20            if(minOpen < 0) minOpen = 0;
21        }
22        return minOpen == 0;
23    }
24}