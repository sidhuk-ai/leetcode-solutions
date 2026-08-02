// Last updated: 8/2/2026, 10:20:20 PM
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        int[] nSE = nextSmaller(arr);
4        int[] psSE = previousSmaller(arr);
5        int mod = (int)(1e9+7);
6        int res = 0;
7        for(int i = 0; i < arr.length; i++) {
8            int left = i - psSE[i];
9            int right = nSE[i] - i;
10
11            long freq = left*right*1L;
12            int weight = (int)((arr[i]*freq)%mod);
13
14            res = (int)((res+weight)%mod);
15        }
16        return res;
17    }
18    private int[] previousSmaller(int[] arr) {
19        Deque<Integer> st = new ArrayDeque<>();
20        int[] res = new int[arr.length];
21        for(int i = 0; i < arr.length; i++) {
22            while(!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
23
24            res[i] = st.isEmpty() ? -1 : st.peek();
25            st.push(i);
26        }
27        return res;
28    }
29    private int[] nextSmaller(int[] arr) {
30        Deque<Integer> st = new ArrayDeque<>();
31        int[] res = new int[arr.length];
32        for(int i = arr.length-1; i >= 0; i--) {
33            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
34
35            res[i] = st.isEmpty() ? arr.length:st.peek();
36            st.push(i);
37        }
38        return res;
39    }
40}