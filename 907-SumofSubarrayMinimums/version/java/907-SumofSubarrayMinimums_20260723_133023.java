// Last updated: 7/23/2026, 1:30:23 PM
1class Solution {
2    private int[] nextSmaller(int[] arr) {
3        Deque<Integer> st = new ArrayDeque<>();
4        int[] ans = new int[arr.length];
5        for(int i = arr.length-1; i >= 0; i--) {
6            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
7
8            ans[i] = st.isEmpty() ? arr.length : st.peek();
9            st.push(i);
10        }
11        return ans;
12    }
13    private int[] previousSmaller(int[] arr) {
14        Deque<Integer> st = new ArrayDeque<>();
15        int[] ans = new int[arr.length];
16        for(int i = 0; i < arr.length; i++) {
17            while(!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
18
19            ans[i] = st.isEmpty() ? -1 : st.peek();
20            st.push(i);
21        }
22        return ans;
23    }
24    public int sumSubarrayMins(int[] arr) {
25        int total = 0;
26        int mod = (int)1e9+7;
27        int[] nse = nextSmaller(arr);
28        int[] psee = previousSmaller(arr);
29
30        for(int i = 0; i < arr.length; i++) {
31            int left = i - psee[i];
32            int right = nse[i] - i;
33
34            long freq = (left*right*1L);
35            int val = (int)((freq * arr[i]) % mod);
36
37            // Add contribution to sum
38            total = (total + val) % mod;
39        }
40        return total;
41    }
42}