// Last updated: 7/16/2026, 10:12:34 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> result = new ArrayList<>();
4        generate(0,0,result,n, new StringBuilder());
5        return result;
6                
7    }
8    static void generate(int open,int close,List<String> result,int n,StringBuilder curr){
9        if(curr.length() == 2*n){
10            result.add(curr.toString());
11            return;
12        }
13        if(open<n){
14            curr.append('(');
15            generate(open+1,close,result,n,curr);
16            curr.deleteCharAt(curr.length() -1);
17        }
18        if(close<open){
19            curr.append(')');
20            generate(open,close+1,result,n,curr);
21            curr.deleteCharAt(curr.length() -1);
22        }
23    }
24}