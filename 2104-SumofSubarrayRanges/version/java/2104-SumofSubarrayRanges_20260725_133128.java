// Last updated: 7/25/2026, 1:31:28 PM
1class Solution {
2    private int[] nextSE(int[] nums) {
3        int n = nums.length;
4        int[] res = new int[n];
5        Deque<Integer> st = new ArrayDeque<>();
6        for(int i = n-1; i >= 0; i--) {
7            while(!st.isEmpty() && nums[st.peek()] > nums[i]) st.pop();
8            res[i] = st.isEmpty() ? n : st.peek();
9            st.push(i);
10        }
11        return res;
12    }
13    private int[] nextGE(int[] nums) {
14        int n = nums.length;
15        int[] res = new int[n];
16        Deque<Integer> st = new ArrayDeque<>();
17        for(int i = n-1; i >= 0; i--) {
18            while(!st.isEmpty() && nums[st.peek()] < nums[i]) st.pop();
19            res[i] = st.isEmpty() ? n : st.peek();
20            st.push(i);
21        }
22        return res;
23    }
24    private int[] previousSEE(int[] nums) {
25        int n = nums.length;
26        int[] res = new int[n];
27        Deque<Integer> st = new ArrayDeque<>();
28        for(int i = 0; i < n; i++) {
29            while(!st.isEmpty() && nums[st.peek()] >= nums[i]) st.pop();
30            res[i] = st.isEmpty() ? -1 : st.peek();
31            st.push(i);
32        }
33        return res;
34    }
35    private int[] previousGEE(int[] nums) {
36        int n = nums.length;
37        int[] res = new int[n];
38        Deque<Integer> st = new ArrayDeque<>();
39        for(int i = 0; i < n; i++) {
40            while(!st.isEmpty() && nums[st.peek()] <= nums[i]) st.pop();
41            res[i] = st.isEmpty() ? -1 : st.peek();
42            st.push(i);
43        }
44        return res;
45    }
46
47    private long sumOfMinSubarrays(int[] nums) {
48        int[] nSE = nextSE(nums);
49        int[] pSEE = previousSEE(nums);
50        long sum = 0;
51
52        for(int i = 0; i < nums.length; i++) {
53            int left = i - pSEE[i];
54            int right = nSE[i] - i;
55            int freq = left*right;
56            long res = 1L * freq * nums[i];
57            sum += res;
58        }
59        return sum;
60    }
61
62    private long sumOfMaxSubArrays(int[] nums) {
63        int[] nGE = nextGE(nums);
64        int[] pGEE = previousGEE(nums);
65        long sum = 0;
66
67        for(int i = 0; i < nums.length; i++) {
68            int left = i - pGEE[i];
69            int right = nGE[i] - i;
70            int freq = left*right;
71            long res = 1L * freq * nums[i];
72            sum += res;
73        }
74        return sum;
75    }
76
77    public long subArrayRanges(int[] nums) {
78        return sumOfMaxSubArrays(nums) - sumOfMinSubarrays(nums);
79    }
80}