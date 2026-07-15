// Last updated: 7/15/2026, 7:22:41 PM
// made major problem at checking the condition for overflow, just check that once
1class Solution {
2    public int myAtoi(String s) {
3        if (s.length() == 0)
4            return 0;
5        int result = 0;
6        int pointer = 0;
7        while (pointer < s.length() && s.charAt(pointer) == ' ')
8            pointer++;
9        int sign = 1;
10        if (pointer < s.length() && s.charAt(pointer) == '-') {
11            sign = -1;
12            pointer++;
13        } else if (pointer < s.length() && s.charAt(pointer) == '+') {
14            sign = 1;
15            pointer++;
16        } else {
17            sign = 1;
18        }
19        for (int i = pointer; i < s.length(); i++) {
20            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
21                int digit = s.charAt(i) - '0';
22
23                if (result > Integer.MAX_VALUE / 10 ||
24                        (result == Integer.MAX_VALUE / 10 &&
25                                digit > 7)) {
26
27                    return sign == 1
28                            ? Integer.MAX_VALUE
29                            : Integer.MIN_VALUE;
30                }
31
32                result = result * 10 + digit;
33            } else {
34                return sign == 1 ? result : -result;
35            }
36        }
37        return sign == 1 ? result : -result;
38    }
39}