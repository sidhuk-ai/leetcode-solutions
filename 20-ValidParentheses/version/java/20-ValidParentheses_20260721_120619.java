// Last updated: 7/21/2026, 12:06:19 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4        for(int i = 0; i < s.length(); i++) {
5            if(!st.isEmpty()) {
6                if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
7                    st.push(s.charAt(i));
8                }
9                else if((s.charAt(i) == ')' && st.peek() == '(') || (s.charAt(i) == ']' && st.peek() == '[') || (s.charAt(i) == '}' && st.peek() == '{')) {
10                    st.pop();
11                }
12                else {
13                    st.push(s.charAt(i));
14                }
15            }
16            else {
17                st.push(s.charAt(i));
18            }
19        }
20
21        return st.isEmpty();
22    }
23}