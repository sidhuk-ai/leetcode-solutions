// Last updated: 8/4/2026, 11:52:55 AM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int[] arr = new int[k];
4        int maxPoint = Integer.MIN_VALUE;
5        int sum = 0;
6        for(int i = 0; i < k; i++) {
7            sum += cardPoints[i];
8            arr[i] = cardPoints[i]; 
9        }
10        maxPoint = sum;
11        if(k == cardPoints.length) return maxPoint;
12        int pointer = cardPoints.length-1;
13        for(int i = k-1; i >= 0; i--) {
14            sum -= arr[i];
15            arr[i] = cardPoints[pointer--];
16            sum += arr[i];
17            maxPoint = Math.max(sum,maxPoint);
18        // System.out.println(sum+" "+maxPoint);
19        }
20        return maxPoint;
21    }
22}