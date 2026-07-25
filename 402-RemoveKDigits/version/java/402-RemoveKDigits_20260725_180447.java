// Last updated: 7/25/2026, 6:04:47 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        if(num.length() == k) return "0";
4        Deque<Character> st = new ArrayDeque<>();
5        StringBuilder sb = new StringBuilder();
6        for(int i = 0; i < num.length(); i++) {
7            while(!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)) {
8                st.pop();
9                k--;
10            }
11            st.push(num.charAt(i));
12        }
13        while(k > 0) {
14            st.pop();
15            k--;
16        }
17        // System.out.println(res);
18        while(st.peekLast() != null && st.peekLast() == '0') st.removeLast();
19        if(st.isEmpty()) return "0";
20        while(!st.isEmpty()) {
21            sb.append(st.removeLast());
22            // System.out.println(st + " Res: "+res);
23        }
24        return sb.toString();
25    }
26}