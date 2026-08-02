// Last updated: 8/2/2026, 7:42:15 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        Deque<Integer> st = new ArrayDeque<>();
4        int[] res = new int[nums.length];
5
6        for(int i = nums.length-1; i >= 0; i--) {
7            while(!st.isEmpty() && st.peek() <= nums[i]) st.pop();
8            st.push(nums[i]);
9        }
10
11        for(int i = nums.length-1; i >= 0; i--) {
12            while(!st.isEmpty() && st.peek() <= nums[i]) st.pop();
13
14            res[i] = st.isEmpty() ? -1 : st.peek();
15            st.push(nums[i]);
16        }
17        return res;
18    }
19}