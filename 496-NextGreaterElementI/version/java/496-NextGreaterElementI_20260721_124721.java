// Last updated: 7/21/2026, 12:47:21 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Stack<Integer> st = new Stack<>();
4        int[] ans = new int[nums1.length];
5        for(int i = nums1.length-1; i >= 0; i--) {
6            st.push(nums1[i]);
7        }
8
9        int pointer = 0;
10        int ansPointer = 0;
11        while(!st.isEmpty()) {
12            int elem = st.pop();
13            while(pointer < nums2.length && nums2[pointer] != elem) pointer++;
14
15            while(pointer < nums2.length && nums2[pointer] <= elem) pointer++;
16
17            if(pointer == nums2.length) {
18                ans[ansPointer++] = -1;
19            } else {
20                ans[ansPointer++] = nums2[pointer];
21            }
22            pointer = 0;
23        }
24        return ans;
25    }
26}