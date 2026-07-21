// Last updated: 7/21/2026, 6:06:37 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int result[] = new int[nums.length];
4        Stack<Integer> st = new Stack<>();
5        for(int i = nums.length-1; i >= 0; i--) {
6            while(!st.isEmpty() && st.peek() <= nums[i]) st.pop();
7            st.push(nums[i]);
8        }
9        for(int i = nums.length-1; i >= 0; i--) {
10            while(!st.isEmpty() && st.peek() <= nums[i]) st.pop();
11            result[i] = st.isEmpty() ? -1:st.peek();
12            st.push(nums[i]);
13        }
14        return result;
15    }
16}