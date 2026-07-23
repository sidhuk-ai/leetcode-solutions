// Last updated: 7/23/2026, 8:15:25 PM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Deque<Integer> st = new ArrayDeque<>();
4        for(int i = 0; i < asteroids.length; i++) {
5            if(asteroids[i] < 0) {
6                while(!st.isEmpty() && !(st.peek() < 0) && st.peek() < Math.abs(asteroids[i])) st.pop();
7                if(st.isEmpty() || st.peek() < 0) st.push(asteroids[i]);
8                if(!st.isEmpty() && st.peek() == Math.abs(asteroids[i])) st.pop();
9                System.out.println("Stack: "+st + " Element: "+asteroids[i]);
10            } else {
11                st.push(asteroids[i]);
12            }
13        }
14        int[] ans = new int[st.size()];
15        int pointer = st.size()-1;
16        for(int i: st) {
17            ans[pointer--] = i;
18        }
19        return ans;
20    }
21}