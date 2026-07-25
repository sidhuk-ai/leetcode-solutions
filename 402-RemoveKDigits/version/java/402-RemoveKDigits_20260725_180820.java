// Last updated: 7/25/2026, 6:08:20 PM
1class Solution {
2    public String removeKdigits(String nums, int k) {
3        Stack<Character> st = new Stack<>();
4
5        // Traverse the given string
6        for (int i = 0; i < nums.length(); i++) {
7            char digit = nums.charAt(i); // Current digit
8
9            // Pop last digits if a smaller digit is found and k > 0
10            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
11                st.pop(); // Remove the last digit
12                k--; // Decrement k by 1
13            }
14
15            // Push the current digit
16            st.push(digit);
17        }
18
19        // If more digits can be removed
20        while (k > 0) {
21            st.pop(); // Pop the last added digits
22            k--; // Decrement k by 1
23        }
24
25        // Handle edge case: if stack is empty
26        if (st.isEmpty()) return "0";
27
28        // StringBuilder to store the result
29        StringBuilder res = new StringBuilder();
30
31        // Add digits from stack to result
32        while (!st.isEmpty()) {
33            res.append(st.pop());
34        }
35
36        // Trim the leading zeros
37        while (res.length() > 0 && res.charAt(res.length() - 1) == '0') {
38            res.deleteCharAt(res.length() - 1);
39        }
40
41        // Reverse the string to get the correct number
42        res.reverse();
43
44        // If result is empty, return "0"
45        if (res.length() == 0) return "0";
46
47        // Return the result as a string
48        return res.toString();
49    }
50}