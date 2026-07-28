// Last updated: 7/28/2026, 10:52:32 PM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        int[] left = new int[heights.length];
4        int[] right = new int[heights.length];
5        Deque<Integer> st = new ArrayDeque<>();
6        int n = heights.length;
7
8        for(int i = 0; i < n; i++) {
9            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
10
11            left[i] = st.isEmpty() ? 0 : st.peek()+1;
12            st.push(i);
13        }
14        st.clear();
15        for(int i = n-1; i >= 0; i--) {
16            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
17
18            right[i] = st.isEmpty() ? n-1 : st.peek()-1;
19            st.push(i);
20        }
21        int res = Integer.MIN_VALUE;
22        for(int i = 0; i < n; i++) {
23            res = Math.max(res,(right[i]-left[i]+1)*heights[i]);
24        }
25        return res;
26    }
27}