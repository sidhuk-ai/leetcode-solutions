// Last updated: 7/15/2026, 1:19:05 AM
1class MinStack {
2    Stack<Integer> st;
3    Stack<Integer> minSt;
4    public MinStack() {
5        st = new Stack<>();
6        minSt = new Stack<>();
7    }
8    
9    public void push(int value) {
10        st.push(value);
11        if(minSt.isEmpty() || value <= minSt.peek()) {
12            minSt.push(value);
13        }
14        // System.out.println("After push: "+st);
15        // System.out.println("After push: "+minSt);
16    }
17    
18    public void pop() {
19        if(st.isEmpty() || minSt.isEmpty()) return;
20        if(st.peek().equals(minSt.peek())) minSt.pop();
21        st.pop();
22        // System.out.println("After pop: "+st);
23        // System.out.println("After pop: "+minSt);
24    }
25    
26    public int top() {
27        if(st.isEmpty()) return 0;
28        return st.peek();
29    }
30    
31    public int getMin() {
32        if(minSt.isEmpty()) return 0;
33        return minSt.peek();
34    }
35}
36
37/**
38 * Your MinStack object will be instantiated and called as such:
39 * MinStack obj = new MinStack();
40 * obj.push(value);
41 * obj.pop();
42 * int param_3 = obj.top();
43 * int param_4 = obj.getMin();
44 */